package typings.reactDashLive

import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.Language
import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeDisabled extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Language] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* code */ String, Unit]] = js.undefined
  var theme: js.UndefOr[PrismTheme] = js.undefined
}

object Anon_CodeDisabled {
  @scala.inline
  def apply(
    code: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    language: Language = null,
    onChange: /* code */ String => Unit = null,
    theme: PrismTheme = null
  ): Anon_CodeDisabled = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (language != null) __obj.updateDynamic("language")(language)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[Anon_CodeDisabled]
  }
}

