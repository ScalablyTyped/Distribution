package typings
package reactDashSvgLib.reactDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var afterInjection: atTanemSvgDashInjectorLib.distTypesMod.Errback
  var beforeInjection: atTanemSvgDashInjectorLib.distTypesMod.BeforeEach
  var evalScripts: js.UndefOr[atTanemSvgDashInjectorLib.distTypesMod.EvalScripts] = js.undefined
  var fallback: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var loading: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined
  var src: java.lang.String
  var wrapper: js.UndefOr[
    reactDashSvgLib.reactDashSvgLibStrings.div | reactDashSvgLib.reactDashSvgLibStrings.span
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    afterInjection: atTanemSvgDashInjectorLib.distTypesMod.Errback,
    beforeInjection: atTanemSvgDashInjectorLib.distTypesMod.BeforeEach,
    src: java.lang.String,
    evalScripts: atTanemSvgDashInjectorLib.distTypesMod.EvalScripts = null,
    fallback: reactLib.reactMod.ReactType[_] = null,
    loading: reactLib.reactMod.ReactType[_] = null,
    renumerateIRIElements: js.UndefOr[scala.Boolean] = js.undefined,
    wrapper: reactDashSvgLib.reactDashSvgLibStrings.div | reactDashSvgLib.reactDashSvgLibStrings.span = null
  ): Props = {
    val __obj = js.Dynamic.literal(afterInjection = afterInjection, beforeInjection = beforeInjection, src = src)
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

