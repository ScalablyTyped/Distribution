package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fonts extends js.Object {
  var fonts: Base
  var size: Code
  var weight: Black
}

object Fonts {
  @scala.inline
  def apply(fonts: Base, size: Code, weight: Black): Fonts = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fonts]
  }
}

