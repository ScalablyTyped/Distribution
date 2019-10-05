package typings.reactDashToolbox.libTabsTabsMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libMod.ReactToolbox.Props
import typings.reactDashToolbox.reactDashToolboxStrings.display
import typings.reactDashToolbox.reactDashToolboxStrings.unmounted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Disable the animation below the active tab.
    * @default false
    */
  var disableAnimatedBottomBorder: js.UndefOr[Boolean] = js.undefined
  /**
    * If True, the tabs will be fixed, covering the whole width.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * `unmounted` mode will not mount the tab content of inactive tabs.
    * `display` mode will mount but hide inactive tabs.
    * Consider holding state outside of the Tabs component before using `display` mode
    * @default unmounted
    */
  var hideMode: js.UndefOr[display | unmounted] = js.undefined
  /**
    * Current
    * @default 0
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * If True, the tabs will have an inverse style.
    */
  var inverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback function that is fired when the tab changes.
    */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabsTheme] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    disableAnimatedBottomBorder: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    hideMode: display | unmounted = null,
    index: Int | Double = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onChange: js.Function = null,
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
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    style: CSSProperties = null,
    theme: TabsTheme = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableAnimatedBottomBorder)) __obj.updateDynamic("disableAnimatedBottomBorder")(disableAnimatedBottomBorder)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
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
    __obj.asInstanceOf[TabsProps]
  }
}

