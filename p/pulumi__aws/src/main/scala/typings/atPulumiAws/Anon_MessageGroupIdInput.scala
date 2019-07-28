package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageGroupIdInput extends js.Object {
  var messageGroupId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MessageGroupIdInput {
  @scala.inline
  def apply(messageGroupId: Input[String] = null): Anon_MessageGroupIdInput = {
    val __obj = js.Dynamic.literal()
    if (messageGroupId != null) __obj.updateDynamic("messageGroupId")(messageGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessageGroupIdInput]
  }
}

