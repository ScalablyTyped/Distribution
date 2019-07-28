package typings.reactDashToolbox.libMenuIconMenuMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libMod.ReactToolboxNs.Props
import typings.reactDashToolbox.reactDashToolboxStrings.auto
import typings.reactDashToolbox.reactDashToolboxStrings.bottomLeft
import typings.reactDashToolbox.reactDashToolboxStrings.bottomRight
import typings.reactDashToolbox.reactDashToolboxStrings.static
import typings.reactDashToolbox.reactDashToolboxStrings.topLeft
import typings.reactDashToolbox.reactDashToolboxStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMenuProps extends Props {
  /**
    * If true, the inner Menu component will be active.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Icon font key string or Element to display the opener icon.
    * @default more_vert
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * If true, the icon will show a ripple when is clicked.
    * @default true
    */
  var iconRipple: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the neutral colors are inverted. Useful if the icon is over a dark background.
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Transferred to the Menu component.
    * @default true
    */
  var menuRipple: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback that will be called when the menu is being hidden.
    */
  var onHide: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback that will be invoked when a menu item is selected.
    */
  var onSelect: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback that will be invoked when the menu is being shown.
    */
  var onShow: js.UndefOr[js.Function] = js.undefined
  /**
    * Determines the position of the menu. This property is transferred to the inner Menu component.
    * @default auto
    */
  var position: js.UndefOr[auto | static | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
  /**
    * If true, the menu will keep a value to highlight the active child item.
    * @default false
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
    */
  var selected: js.UndefOr[js.Any] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[IconMenuTheme] = js.undefined
}

object IconMenuProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    icon: ReactNode = null,
    iconRipple: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    menuRipple: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onHide: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onSelect: js.Function = null,
    onShow: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    position: auto | static | topLeft | topRight | bottomLeft | bottomRight = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.Any = null,
    style: CSSProperties = null,
    theme: IconMenuTheme = null
  ): IconMenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRipple)) __obj.updateDynamic("iconRipple")(iconRipple)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(menuRipple)) __obj.updateDynamic("menuRipple")(menuRipple)
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
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IconMenuProps]
  }
}

