package typings.reactDashToolbox.libButtonBrowseButtonMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libButtonBaseMod.ButtonBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseButtonProps extends ButtonBaseProps {
  /**
    * If true, the button will have a flat look.
    * @default false
    */
  var flat: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the button will have a floating look.
    * @default false
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  /**
    * Creates a link for the button.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * The text string to use for the name of the button.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * To be used with floating button. If true, the button will be smaller.
    * @default false
    */
  var mini: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[BrowseButtonTheme] = js.undefined
}

object BrowseButtonProps {
  @scala.inline
  def apply(
    accent: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flat: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: ReactNode = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: String = null,
    mini: js.UndefOr[Boolean] = js.undefined,
    neutral: js.UndefOr[Boolean] = js.undefined,
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
    primary: js.UndefOr[Boolean] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    ripple: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    theme: BrowseButtonTheme = null,
    `type`: String = null
  ): BrowseButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral)
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
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BrowseButtonProps]
  }
}

