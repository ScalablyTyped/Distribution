package typings.reactDashLive.reactDashLiveMod

import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.Language
import typings.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextProps extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[Language] = js.undefined
  var theme: PrismTheme
}

object ContextProps {
  @scala.inline
  def apply(
    theme: PrismTheme,
    code: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    language: Language = null
  ): ContextProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextProps]
  }
}

