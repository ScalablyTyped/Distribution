package typings.reactDashIntl.distComponentsProviderMod

import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlShape
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
    * list of memoized props we care about.
    * This is important since creating intl is
    * very expensive
    */
  var prevProps: OptionalIntlConfig
}

object State {
  @scala.inline
  def apply(cache: IntlCache, prevProps: OptionalIntlConfig, intl: IntlShape = null): State = {
    val __obj = js.Dynamic.literal(cache = cache, prevProps = prevProps)
    if (intl != null) __obj.updateDynamic("intl")(intl)
    __obj.asInstanceOf[State]
  }
}

