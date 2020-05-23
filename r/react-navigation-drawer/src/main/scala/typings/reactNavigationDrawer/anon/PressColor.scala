package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PressColor extends js.Object {
  var borderless: Boolean
  var pressColor: String
}

object PressColor {
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): PressColor = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressColor]
  }
}

