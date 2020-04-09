package typings.reactSvg.typesMod

import typings.react.mod.ReactType
import typings.reactSvg.reactSvgStrings.div
import typings.reactSvg.reactSvgStrings.span
import typings.std.Error
import typings.std.SVGElement
import typings.tanemSvgInjector.typesMod.BeforeEach
import typings.tanemSvgInjector.typesMod.Errback
import typings.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var afterInjection: js.UndefOr[Errback] = js.undefined
  var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var fallback: js.UndefOr[ReactType[_]] = js.undefined
  var loading: js.UndefOr[ReactType[_]] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  var src: String
  var wrapper: js.UndefOr[div | span] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    src: String,
    afterInjection: (/* error */ Error | Null, /* svg */ js.UndefOr[SVGElement]) => Unit = null,
    beforeInjection: /* svg */ SVGElement => Unit = null,
    evalScripts: EvalScripts = null,
    fallback: ReactType[_] = null,
    loading: ReactType[_] = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (afterInjection != null) __obj.updateDynamic("afterInjection")(js.Any.fromFunction2(afterInjection))
    if (beforeInjection != null) __obj.updateDynamic("beforeInjection")(js.Any.fromFunction1(beforeInjection))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

