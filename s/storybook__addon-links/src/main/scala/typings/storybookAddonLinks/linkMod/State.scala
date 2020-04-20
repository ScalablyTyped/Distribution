package typings.storybookAddonLinks.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var href: String
}

object State {
  @scala.inline
  def apply(href: String): State = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

