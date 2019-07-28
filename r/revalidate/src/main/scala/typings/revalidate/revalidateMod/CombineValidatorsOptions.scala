package typings.revalidate.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineValidatorsOptions extends js.Object {
  var serializeValues: js.UndefOr[js.Function1[/* values */ js.Any, _]] = js.undefined
}

object CombineValidatorsOptions {
  @scala.inline
  def apply(serializeValues: /* values */ js.Any => _ = null): CombineValidatorsOptions = {
    val __obj = js.Dynamic.literal()
    if (serializeValues != null) __obj.updateDynamic("serializeValues")(js.Any.fromFunction1(serializeValues))
    __obj.asInstanceOf[CombineValidatorsOptions]
  }
}

