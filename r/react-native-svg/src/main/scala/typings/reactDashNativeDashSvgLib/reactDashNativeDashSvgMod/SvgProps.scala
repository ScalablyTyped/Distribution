package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SvgProps extends js.Object {
  var height: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object SvgProps {
  @scala.inline
  def apply(
    height: reactDashNativeDashSvgLib.NumberProp = null,
    preserveAspectRatio: java.lang.String = null,
    viewBox: java.lang.String = null,
    width: reactDashNativeDashSvgLib.NumberProp = null
  ): SvgProps = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgProps]
  }
}

