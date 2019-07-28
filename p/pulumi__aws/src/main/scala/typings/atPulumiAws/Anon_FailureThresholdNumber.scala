package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThresholdNumber extends js.Object {
  var failureThreshold: js.UndefOr[Double] = js.undefined
}

object Anon_FailureThresholdNumber {
  @scala.inline
  def apply(failureThreshold: Int | Double = null): Anon_FailureThresholdNumber = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailureThresholdNumber]
  }
}

