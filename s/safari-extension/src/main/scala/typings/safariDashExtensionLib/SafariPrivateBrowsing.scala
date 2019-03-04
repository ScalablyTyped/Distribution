package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariPrivateBrowsing extends js.Object {
  var enabled: scala.Boolean
}

object SafariPrivateBrowsing {
  @scala.inline
  def apply(enabled: scala.Boolean): SafariPrivateBrowsing = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[SafariPrivateBrowsing]
  }
}

