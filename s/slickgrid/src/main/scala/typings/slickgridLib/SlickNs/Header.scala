package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var buttons: js.Array[HeaderButton]
}

object Header {
  @scala.inline
  def apply(buttons: js.Array[HeaderButton]): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons)
    __obj.asInstanceOf[Header]
  }
}

