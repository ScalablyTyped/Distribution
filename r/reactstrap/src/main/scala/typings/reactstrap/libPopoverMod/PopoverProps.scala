package typings.reactstrap.libPopoverMod

import org.scalablytyped.runtime.StringDictionary
import typings.popperDotJs.popperDotJsMod.Boundary
import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.popperDotJs.popperDotJsMod.Placement
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEventHandler
import typings.reactstrap.Anon_Hide
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fade: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var hideArrow: js.UndefOr[Boolean] = js.undefined
  var innerClassName: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var placementPrefix: js.UndefOr[String] = js.undefined
  var target: String | HTMLElement
  var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    target: String | HTMLElement,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    boundariesElement: Boundary | Element = null,
    className: String = null,
    container: String | HTMLElement = null,
    cssModule: CSSModule = null,
    delay: Double | Anon_Hide = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fade: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    innerClassName: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    placement: Placement = null,
    placementPrefix: String = null,
    toggle: MouseEventHandler[_] | js.Function0[Unit] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow)
    if (innerClassName != null) __obj.updateDynamic("innerClassName")(innerClassName)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (placementPrefix != null) __obj.updateDynamic("placementPrefix")(placementPrefix)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

