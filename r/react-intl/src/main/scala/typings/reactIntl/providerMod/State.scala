package typings.reactIntl.providerMod

import typings.reactIntl.typesMod.IntlCache
import typings.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /**
    * Explicit intl cache to prevent memory leaks
    */
  var cache: IntlCache
  /**
    * Intl object we created
    */
  var intl: js.UndefOr[IntlShape] = js.undefined
  /**
    * list of memoized config we care about.
    * This is important since creating intl is
    * very expensive
    */
  var prevConfig: OptionalIntlConfig
}

object State {
  @scala.inline
  def apply(cache: IntlCache, prevConfig: OptionalIntlConfig, intl: IntlShape = null): State = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
    if (intl != null) __obj.updateDynamic("intl")(intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

