package typings.reactIntl.anon

import typings.reactIntl.providerMod.OptionalIntlConfig
import typings.reactIntl.typesMod.IntlCache
import typings.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl/lib/components/provider.State> */
trait PartialState extends js.Object {
  var cache: js.UndefOr[IntlCache] = js.undefined
  var intl: js.UndefOr[IntlShape] = js.undefined
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.undefined
}

object PartialState {
  @scala.inline
  def apply(cache: IntlCache = null, intl: IntlShape = null, prevConfig: OptionalIntlConfig = null): PartialState = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (intl != null) __obj.updateDynamic("intl")(intl.asInstanceOf[js.Any])
    if (prevConfig != null) __obj.updateDynamic("prevConfig")(prevConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialState]
  }
}

