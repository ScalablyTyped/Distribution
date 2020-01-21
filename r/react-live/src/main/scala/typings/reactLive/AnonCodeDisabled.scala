package typings.reactLive

import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeDisabled extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Language] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* code */ String, Unit]] = js.undefined
  var theme: js.UndefOr[PrismTheme] = js.undefined
}

object AnonCodeDisabled {
  @scala.inline
  def apply(
    code: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    language: Language = null,
    onChange: /* code */ String => Unit = null,
    theme: PrismTheme = null
  ): AnonCodeDisabled = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeDisabled]
  }
}

