package typings.reactDashIntl

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntlValue extends js.Object {
  var intl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/types.IntlShape */ js.Any
  var value: js.UndefOr[Double | Date] = js.undefined
}

object Anon_IntlValue {
  @scala.inline
  def apply(
    intl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_react-intl/dist/types.IntlShape */ js.Any,
    value: Double | Date = null
  ): Anon_IntlValue = {
    val __obj = js.Dynamic.literal(intl = intl)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IntlValue]
  }
}

