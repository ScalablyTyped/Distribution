package typings
package reactDashSketchappLib.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillProps extends js.Object {
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  var fillRule: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero
  ] = js.undefined
}

object FillProps {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    fillOpacity: NumberProp = null,
    fillRule: reactDashSketchappLib.reactDashSketchappLibStrings.evenodd | reactDashSketchappLib.reactDashSketchappLibStrings.nonzero = null
  ): FillProps = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillProps]
  }
}

