package typings.reactLive

import org.scalablytyped.runtime.StringDictionary
import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Language] = js.undefined
  var noInline: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var theme: js.UndefOr[PrismTheme] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
}

object AnonCode {
  @scala.inline
  def apply(
    code: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    language: Language = null,
    noInline: js.UndefOr[Boolean] = js.undefined,
    scope: StringDictionary[js.Any] = null,
    theme: PrismTheme = null,
    transformCode: /* code */ String => String = null
  ): AnonCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(noInline)) __obj.updateDynamic("noInline")(noInline.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[AnonCode]
  }
}

