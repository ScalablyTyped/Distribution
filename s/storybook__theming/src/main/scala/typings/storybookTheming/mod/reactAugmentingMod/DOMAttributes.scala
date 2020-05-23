package typings.storybookTheming.mod.reactAugmentingMod

import typings.emotionCore.mod.InterpolationWithTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](css: js.UndefOr[Null | InterpolationWithTheme[_]] = js.undefined): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

