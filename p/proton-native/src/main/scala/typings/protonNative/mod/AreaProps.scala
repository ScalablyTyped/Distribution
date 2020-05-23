package typings.protonNative.mod

import typings.protonNative.anon.Buttons
import typings.protonNative.anon.H
import typings.protonNative.anon.X
import typings.protonNative.protonNativeStrings.bevel
import typings.protonNative.protonNativeStrings.flat
import typings.protonNative.protonNativeStrings.miter
import typings.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaProps extends AreaBaseProps {
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Buttons, Unit]] = js.undefined
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AreaProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    expand: H = null,
    fill: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    label: String = null,
    onKeyDown: /* event */ KeyboardEvent => Boolean = null,
    onKeyUp: /* event */ KeyboardEvent => Boolean = null,
    onMouseDown: /* event */ MouseEvent => Unit = null,
    onMouseEnter: () => Unit = null,
    onMouseLeave: () => Unit = null,
    onMouseMove: /* event */ Buttons => Unit = null,
    onMouseUp: /* event */ MouseEvent => Unit = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: js.UndefOr[Double] = js.undefined,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    transform: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AreaProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeMiterlimit)) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaProps]
  }
}

