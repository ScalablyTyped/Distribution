package typings
package reactDashToolboxLib.libTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
  * Additional properties passed to Tab root container.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * If true, the current component is visible.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional class name to provide custom styling for the active tab.
    */
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the current component is not clickable.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the current component is not visible.
    * @default false
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon to be used in inner FontIcon.
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Label text for navigation header.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function that is fired when the tab is activated.
    */
  var onActive: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabTheme] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to Tab root container.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeClassName: java.lang.String = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    label: java.lang.String = null,
    onActive: coreDashJsLib.Function = null,
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
    theme: TabTheme = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onActive != null) __obj.updateDynamic("onActive")(onActive)
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
    __obj.asInstanceOf[TabProps]
  }
}

