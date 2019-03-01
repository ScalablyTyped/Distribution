package typings
package reactDashToolboxLib.libSnackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Label for the action component inside the Snackbar.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the snackbar will be active.
    * @default true
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Text to display in the content.
    */
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Callback function when finish the set timeout.
    */
  var onTimeout: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SnackbarTheme] = js.undefined
  /**
    * Amount of time in milliseconds after the Snackbar will be automatically hidden.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the action type. Can be accept, warning or cancel
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.accept | reactDashToolboxLib.reactDashToolboxLibStrings.cancel | reactDashToolboxLib.reactDashToolboxLibStrings.warning
  ] = js.undefined
}

object SnackbarProps {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
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
    onTimeout: coreDashJsLib.Function = null,
    onTouchCancel: coreDashJsLib.Function = null,
    onTouchEnd: coreDashJsLib.Function = null,
    onTouchMove: coreDashJsLib.Function = null,
    onTouchStart: coreDashJsLib.Function = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: SnackbarTheme = null,
    timeout: scala.Int | scala.Double = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.accept | reactDashToolboxLib.reactDashToolboxLibStrings.cancel | reactDashToolboxLib.reactDashToolboxLibStrings.warning = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
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
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(onTimeout)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

