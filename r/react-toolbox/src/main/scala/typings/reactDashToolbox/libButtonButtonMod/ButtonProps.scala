package typings.reactDashToolbox.libButtonButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libButtonBaseMod.ButtonBaseProps
import typings.reactDashToolbox.libButtonBaseMod.ButtonTheme
import typings.reactDashToolbox.libRippleMod.RippleTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashToolbox.libRippleMod.RippleProps because var conflicts: children, disabled. Inlined onRippleEnded, spread, theme */ trait ButtonProps
  extends ButtonBaseProps
     with /**
  * Additional properties passed to rippled component.
  */
/* key */ StringDictionary[js.Any] {
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
  /**
    * Function that will be called when the ripple animation ends.
    */
  var onRippleEnded: js.UndefOr[js.Function] = js.undefined
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.undefined
  /**
    * Factor to indicate how much should the ripple spread under the component.
    * @default 2
    */
  var spread: js.UndefOr[Double] = js.undefined
  /**
    * Passed down to the root element
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ButtonTheme | RippleTheme] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional properties passed to rippled component.
    */
  /* key */ StringDictionary[js.Any] = null,
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
    onRippleEnded: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    ripple: js.UndefOr[Boolean] = js.undefined,
    spread: Int | Double = null,
    style: CSSProperties = null,
    target: String = null,
    theme: ButtonTheme = null,
    `type`: String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    if (onRippleEnded != null) __obj.updateDynamic("onRippleEnded")(onRippleEnded)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple)
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ButtonProps]
  }
}

