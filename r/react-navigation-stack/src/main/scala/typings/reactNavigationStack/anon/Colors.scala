package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: Background
  var dark: Boolean
}

object Colors {
  @scala.inline
  def apply(colors: Background, dark: Boolean): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

