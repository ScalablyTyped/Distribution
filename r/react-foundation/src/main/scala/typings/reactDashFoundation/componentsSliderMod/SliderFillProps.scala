package typings.reactDashFoundation.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderFillProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object SliderFillProps {
  @scala.inline
  def apply(className: String = null): SliderFillProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderFillProps]
  }
}

