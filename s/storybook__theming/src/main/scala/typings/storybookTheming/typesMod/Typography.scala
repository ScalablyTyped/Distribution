package typings.storybookTheming.typesMod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var fonts: Base
  var size: Code
  var weight: Black
}

object Typography {
  @scala.inline
  def apply(fonts: Base, size: Code, weight: Black): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
}

