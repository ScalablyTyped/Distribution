package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContinuousOneTime extends js.Object {
  var continuous: js.UndefOr[Input[String]] = js.undefined
  var oneTime: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ContinuousOneTime {
  @scala.inline
  def apply(continuous: Input[String] = null, oneTime: Input[String] = null): Anon_ContinuousOneTime = {
    val __obj = js.Dynamic.literal()
    if (continuous != null) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (oneTime != null) __obj.updateDynamic("oneTime")(oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContinuousOneTime]
  }
}

