package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DraftSubstitutiondata extends js.Object {
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}

object Anon_DraftSubstitutiondata {
  @scala.inline
  def apply(draft: js.UndefOr[scala.Boolean] = js.undefined, substitution_data: js.Any = null): Anon_DraftSubstitutiondata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (substitution_data != null) __obj.updateDynamic("substitution_data")(substitution_data)
    __obj.asInstanceOf[Anon_DraftSubstitutiondata]
  }
}

