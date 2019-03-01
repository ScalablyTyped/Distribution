package typings
package safariDashExtensionDashContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extension extends js.Object {
  var extension: SafariContentExtension
  var self: SafariContentWebPage
}

object Anon_Extension {
  @scala.inline
  def apply(extension: SafariContentExtension, self: SafariContentWebPage): Anon_Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Anon_Extension]
  }
}

