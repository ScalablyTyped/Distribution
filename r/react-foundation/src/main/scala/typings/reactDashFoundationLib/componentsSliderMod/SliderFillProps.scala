package typings
package reactDashFoundationLib.componentsSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderFillProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object SliderFillProps {
  @scala.inline
  def apply(className: java.lang.String = null): SliderFillProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[SliderFillProps]
  }
}

