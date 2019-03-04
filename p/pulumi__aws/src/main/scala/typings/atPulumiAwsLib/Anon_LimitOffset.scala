package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LimitOffset extends js.Object {
  var limit: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var offset: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var period: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_LimitOffset {
  @scala.inline
  def apply(
    limit: atPulumiPulumiLib.outputMod.Input[scala.Double],
    period: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    offset: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_LimitOffset = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LimitOffset]
  }
}

