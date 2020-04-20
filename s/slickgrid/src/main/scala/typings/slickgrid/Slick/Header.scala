package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var buttons: js.Array[HeaderButton]
}

object Header {
  @scala.inline
  def apply(buttons: js.Array[HeaderButton]): Header = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

