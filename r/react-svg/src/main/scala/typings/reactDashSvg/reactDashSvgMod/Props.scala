package typings.reactDashSvg.reactDashSvgMod

import typings.atTanemSvgDashInjector.distTypesMod.BeforeEach
import typings.atTanemSvgDashInjector.distTypesMod.Errback
import typings.atTanemSvgDashInjector.distTypesMod.EvalScripts
import typings.react.reactMod.ReactType
import typings.reactDashSvg.reactDashSvgStrings.div
import typings.reactDashSvg.reactDashSvgStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var afterInjection: js.UndefOr[Errback] = js.undefined
  var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var fallback: js.UndefOr[ReactType[_]] = js.undefined
  var loading: js.UndefOr[ReactType[_]] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  var src: String
  var wrapper: js.UndefOr[div | span] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: String,
    afterInjection: Errback = null,
    beforeInjection: BeforeEach = null,
    evalScripts: EvalScripts = null,
    fallback: ReactType[_] = null,
    loading: ReactType[_] = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src)
    if (afterInjection != null) __obj.updateDynamic("afterInjection")(afterInjection)
    if (beforeInjection != null) __obj.updateDynamic("beforeInjection")(beforeInjection)
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

