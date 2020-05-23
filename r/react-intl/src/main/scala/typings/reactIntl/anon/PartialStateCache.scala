package typings.reactIntl.anon

import typings.reactIntl.mod.IntlCache
import typings.reactIntl.mod.IntlShape
import typings.reactIntl.mod.OptionalIntlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-intl.react-intl.State> */
trait PartialStateCache extends js.Object {
  var cache: js.UndefOr[IntlCache] = js.undefined
  var intl: js.UndefOr[IntlShape] = js.undefined
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.undefined
}

object PartialStateCache {
  @scala.inline
  def apply(cache: IntlCache = null, intl: IntlShape = null, prevConfig: OptionalIntlConfig = null): PartialStateCache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (intl != null) __obj.updateDynamic("intl")(intl.asInstanceOf[js.Any])
    if (prevConfig != null) __obj.updateDynamic("prevConfig")(prevConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateCache]
  }
}

