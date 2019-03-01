package typings
package reactDashToolboxLib.libProgressUnderscoreBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Value of a secondary progress bar useful for buffering.
    * @default 0
    */
  var buffer: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum value permitted.
    * @default 100
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum value permitted.
    * @default 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mode of the progress bar, it can be determinate or indeterminate.
    * @default indeterminate
    */
  var mode: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.determinate | reactDashToolboxLib.reactDashToolboxLibStrings.indeterminate
  ] = js.undefined
  /**
    * If true, the circular progress bar will be changing its color.
    * @default false
    */
  var multicolor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ProgressBarTheme] = js.undefined
  /**
    * Type of the progress bar, it can be circular or linear.
    * @default linear
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.linear | reactDashToolboxLib.reactDashToolboxLibStrings.circular
  ] = js.undefined
  /**
    * Value of the current progress.
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    buffer: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    mode: reactDashToolboxLib.reactDashToolboxLibStrings.determinate | reactDashToolboxLib.reactDashToolboxLibStrings.indeterminate = null,
    multicolor: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: coreDashJsLib.Function = null,
    onContextMenu: coreDashJsLib.Function = null,
    onDoubleClick: coreDashJsLib.Function = null,
    onDrag: coreDashJsLib.Function = null,
    onDragEnd: coreDashJsLib.Function = null,
    onDragEnter: coreDashJsLib.Function = null,
    onDragExit: coreDashJsLib.Function = null,
    onDragLeave: coreDashJsLib.Function = null,
    onDragOver: coreDashJsLib.Function = null,
    onDragStart: coreDashJsLib.Function = null,
    onDrop: coreDashJsLib.Function = null,
    onMouseDown: coreDashJsLib.Function = null,
    onMouseEnter: coreDashJsLib.Function = null,
    onMouseLeave: coreDashJsLib.Function = null,
    onMouseMove: coreDashJsLib.Function = null,
    onMouseOut: coreDashJsLib.Function = null,
    onMouseOver: coreDashJsLib.Function = null,
    onMouseUp: coreDashJsLib.Function = null,
    onTouchCancel: coreDashJsLib.Function = null,
    onTouchEnd: coreDashJsLib.Function = null,
    onTouchMove: coreDashJsLib.Function = null,
    onTouchStart: coreDashJsLib.Function = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: ProgressBarTheme = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.linear | reactDashToolboxLib.reactDashToolboxLibStrings.circular = null,
    value: scala.Int | scala.Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multicolor)) __obj.updateDynamic("multicolor")(multicolor)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

