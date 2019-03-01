package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audit extends js.Object {
  var audit: js.UndefOr[scala.Boolean] = js.undefined
  var general: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Audit {
  @scala.inline
  def apply(audit: js.UndefOr[scala.Boolean] = js.undefined, general: js.UndefOr[scala.Boolean] = js.undefined): Anon_Audit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audit)) __obj.updateDynamic("audit")(audit)
    if (!js.isUndefined(general)) __obj.updateDynamic("general")(general)
    __obj.asInstanceOf[Anon_Audit]
  }
}

