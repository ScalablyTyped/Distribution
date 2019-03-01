package typings
package safariDashExtensionDashContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariContentExtension extends js.Object {
  var baseURI: java.lang.String
}

object SafariContentExtension {
  @scala.inline
  def apply(baseURI: java.lang.String): SafariContentExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseURI")(baseURI)
    __obj.asInstanceOf[SafariContentExtension]
  }
}

