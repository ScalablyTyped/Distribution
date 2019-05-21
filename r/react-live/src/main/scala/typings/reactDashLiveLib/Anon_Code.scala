package typings
package reactDashLiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[prismDashReactDashRendererLib.prismDashReactDashRendererMod.Language] = js.undefined
  var noInline: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var theme: js.UndefOr[prismDashReactDashRendererLib.prismDashReactDashRendererMod.PrismTheme] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ java.lang.String, java.lang.String]] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    language: prismDashReactDashRendererLib.prismDashReactDashRendererMod.Language = null,
    noInline: js.UndefOr[scala.Boolean] = js.undefined,
    scope: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    theme: prismDashReactDashRendererLib.prismDashReactDashRendererMod.PrismTheme = null,
    transformCode: /* code */ java.lang.String => java.lang.String = null
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

