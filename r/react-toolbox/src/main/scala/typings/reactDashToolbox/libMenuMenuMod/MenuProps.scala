package typings.reactDashToolbox.libMenuMenuMod

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

trait MenuProps extends Props {
  /**
    * If true, the menu will be displayed as opened by default.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
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
    * If true the menu wrapper will show an outline with a soft shadow.
    * @default true
    */
  var outline: js.UndefOr[Boolean] = js.undefined
  /**
    * Determine the position of the menu. With static value the menu will be always shown, auto means that the it will decide the opening direction based on the current position. To force a position use topLeft, topRight, bottomLeft, bottomRight.
    * @default static
    */
  var position: js.UndefOr[auto | static | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
  /**
    * If true, the menu items will show a ripple effect on click.
    * @default true
    */
  var ripple: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the menu will keep a value to highlight the active child item.
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
    */
  var selected: js.UndefOr[js.Any] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuTheme] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    key: Key = null,
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
    outline: js.UndefOr[Boolean] = js.undefined,
    position: auto | static | topLeft | topRight | bottomLeft | bottomRight = null,
    ripple: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.Any = null,
    style: CSSProperties = null,
    theme: MenuTheme = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[MenuProps]
  }
}

