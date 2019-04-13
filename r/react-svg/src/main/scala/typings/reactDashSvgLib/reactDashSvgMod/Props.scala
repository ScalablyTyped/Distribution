package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var evalScripts: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.EvalScripts] = js.undefined
  var fallback: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var loading: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var onInjected: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.Errback] = js.undefined
  var renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var wrapper: js.UndefOr[
    reactDashSvgLib.reactDashSvgLibStrings.div | reactDashSvgLib.reactDashSvgLibStrings.span
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: java.lang.String,
    evalScripts: atTanemSvgDashInjectorLib.distTypesMod.EvalScripts = null,
    fallback: reactLib.reactMod.ReactType[_] = null,
    loading: reactLib.reactMod.ReactType[_] = null,
    onInjected: atTanemSvgDashInjectorLib.distTypesMod.Errback = null,
    renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined,
    svgClassName: java.lang.String = null,
    svgStyle: reactLib.reactMod.CSSProperties = null,
    wrapper: reactDashSvgLib.reactDashSvgLibStrings.div | reactDashSvgLib.reactDashSvgLibStrings.span = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src)
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onInjected != null) __obj.updateDynamic("onInjected")(onInjected)
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

