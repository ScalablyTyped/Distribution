package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariPrivateBrowsing extends js.Object {
  var enabled: Boolean
}

object SafariPrivateBrowsing {
  @scala.inline
  def apply(enabled: Boolean): SafariPrivateBrowsing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariPrivateBrowsing]
  }
}

