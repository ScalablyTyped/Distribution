package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaProps extends AreaBaseProps {
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, scala.Boolean]] = js.undefined
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, scala.Boolean]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, scala.Unit]] = js.undefined
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ protonDashNativeLib.Anon_Buttons, scala.Unit]] = js.undefined
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, scala.Unit]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object AreaProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    column: scala.Int | scala.Double = null,
    expand: protonDashNativeLib.Anon_H = null,
    fill: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    onKeyDown: js.Function1[/* event */ KeyboardEvent, scala.Boolean] = null,
    onKeyUp: js.Function1[/* event */ KeyboardEvent, scala.Boolean] = null,
    onMouseDown: js.Function1[/* event */ MouseEvent, scala.Unit] = null,
    onMouseEnter: js.Function0[scala.Unit] = null,
    onMouseLeave: js.Function0[scala.Unit] = null,
    onMouseMove: js.Function1[/* event */ protonDashNativeLib.Anon_Buttons, scala.Unit] = null,
    onMouseUp: js.Function1[/* event */ MouseEvent, scala.Unit] = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: java.lang.String = null,
    strokeLinecap: protonDashNativeLib.protonDashNativeLibStrings.flat | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel = null,
    strokeLinejoin: protonDashNativeLib.protonDashNativeLibStrings.miter | protonDashNativeLib.protonDashNativeLibStrings.round | protonDashNativeLib.protonDashNativeLibStrings.bevel = null,
    strokeMiterlimit: scala.Int | scala.Double = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    transform: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AreaProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AreaProps]
  }
}

