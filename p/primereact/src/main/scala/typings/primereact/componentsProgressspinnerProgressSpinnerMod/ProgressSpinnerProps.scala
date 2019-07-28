package typings.primereact.componentsProgressspinnerProgressSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressSpinnerProps extends js.Object {
  var animationDuration: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ProgressSpinnerProps {
  @scala.inline
  def apply(
    animationDuration: String = null,
    className: String = null,
    fill: String = null,
    id: String = null,
    strokeWidth: String = null,
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

