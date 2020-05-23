package typings.reactI18next.mod

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseTranslationOptions extends js.Object {
  var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
  var useSuspense: js.UndefOr[Boolean] = js.undefined
}

object UseTranslationOptions {
  @scala.inline
  def apply(i18n: i18n = null, useSuspense: js.UndefOr[Boolean] = js.undefined): UseTranslationOptions = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (!js.isUndefined(useSuspense)) __obj.updateDynamic("useSuspense")(useSuspense.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTranslationOptions]
  }
}

