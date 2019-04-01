package typings
package primereactLib.componentsProgressspinnerProgressSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressSpinnerProps extends js.Object {
  var animationDuration: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ProgressSpinnerProps {
  @scala.inline
  def apply(
    animationDuration: java.lang.String = null,
    className: java.lang.String = null,
    fill: java.lang.String = null,
    id: java.lang.String = null,
    strokeWidth: java.lang.String = null,
    style: js.Object = null
  ): ProgressSpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration)
    if (className != null) __obj.updateDynamic("className")(className)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (id != null) __obj.updateDynamic("id")(id)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ProgressSpinnerProps]
  }
}

