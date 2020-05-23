package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var background: String
  var color: String
}

object BackgroundColor {
  @scala.inline
  def apply(background: String, color: String): BackgroundColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

