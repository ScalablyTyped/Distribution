package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupNameStatus extends js.Object {
  var groupName: js.UndefOr[Input[String]] = js.undefined
  var status: js.UndefOr[Input[String]] = js.undefined
  var streamName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_GroupNameStatus {
  @scala.inline
  def apply(groupName: Input[String] = null, status: Input[String] = null, streamName: Input[String] = null): Anon_GroupNameStatus = {
    val __obj = js.Dynamic.literal()
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupNameStatus]
  }
}

