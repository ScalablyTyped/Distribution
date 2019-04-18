package typings
package reactstrapLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var boundariesElement: js.UndefOr[popperDotJsLib.popperDotJsMod.Boundary | stdLib.Element] = js.undefined
  var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var delay: js.UndefOr[scala.Double | reactstrapLib.Anon_Hide] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var hideArrow: js.UndefOr[scala.Boolean] = js.undefined
  var innerClassName: js.UndefOr[java.lang.String] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var placementPrefix: js.UndefOr[java.lang.String] = js.undefined
  var target: java.lang.String | stdLib.HTMLElement
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    target: java.lang.String | stdLib.HTMLElement,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    boundariesElement: popperDotJsLib.popperDotJsMod.Boundary | stdLib.Element = null,
    className: java.lang.String = null,
    container: java.lang.String | stdLib.HTMLElement = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    delay: scala.Double | reactstrapLib.Anon_Hide = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    hideArrow: js.UndefOr[scala.Boolean] = js.undefined,
    innerClassName: java.lang.String = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    placement: popperDotJsLib.popperDotJsMod.Placement = null,
    placementPrefix: java.lang.String = null,
    toggle: () => scala.Unit = null
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
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[PopoverProps]
  }
}

