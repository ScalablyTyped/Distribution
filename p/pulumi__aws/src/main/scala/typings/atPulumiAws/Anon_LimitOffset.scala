package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LimitOffset extends js.Object {
  var limit: Input[Double]
  var offset: js.UndefOr[Input[Double]] = js.undefined
  var period: Input[String]
}

object Anon_LimitOffset {
  @scala.inline
  def apply(limit: Input[Double], period: Input[String], offset: Input[Double] = null): Anon_LimitOffset = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LimitOffset]
  }
}

