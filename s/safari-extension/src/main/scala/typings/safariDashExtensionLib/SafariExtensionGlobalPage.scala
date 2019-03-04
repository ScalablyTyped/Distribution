package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariExtensionGlobalPage extends js.Object {
  var contentWindow: Window
}

object SafariExtensionGlobalPage {
  @scala.inline
  def apply(contentWindow: Window): SafariExtensionGlobalPage = {
    val __obj = js.Dynamic.literal(contentWindow = contentWindow)
  
    __obj.asInstanceOf[SafariExtensionGlobalPage]
  }
}

