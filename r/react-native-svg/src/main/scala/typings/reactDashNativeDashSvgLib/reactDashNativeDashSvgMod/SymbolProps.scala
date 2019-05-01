package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProps extends js.Object {
  var id: java.lang.String
  var opacity: js.UndefOr[NumberProp] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object SymbolProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    opacity: NumberProp = null,
    preserveAspectRatio: java.lang.String = null,
    viewBox: java.lang.String = null
  ): SymbolProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[SymbolProps]
  }
}

