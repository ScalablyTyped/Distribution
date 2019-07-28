package typings.reactDashLive

import org.scalablytyped.runtime.StringDictionary
import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.Language
import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Language] = js.undefined
  var noInline: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var theme: js.UndefOr[PrismTheme] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    code: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    language: Language = null,
    noInline: js.UndefOr[Boolean] = js.undefined,
    scope: StringDictionary[js.Any] = null,
    theme: PrismTheme = null,
    transformCode: /* code */ String => String = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(noInline)) __obj.updateDynamic("noInline")(noInline)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[Anon_Code]
  }
}

