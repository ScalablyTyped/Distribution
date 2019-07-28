package typings.atPulumiAws.guarddutyDetectorMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorArgs extends js.Object {
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: js.UndefOr[Input[Boolean]] = js.undefined
  val findingPublishingFrequency: js.UndefOr[Input[String]] = js.undefined
}

object DetectorArgs {
  @scala.inline
  def apply(enable: Input[Boolean] = null, findingPublishingFrequency: Input[String] = null): DetectorArgs = {
    val __obj = js.Dynamic.literal()
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorArgs]
  }
}

