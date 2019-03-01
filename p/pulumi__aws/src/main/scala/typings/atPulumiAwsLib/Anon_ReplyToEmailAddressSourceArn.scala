package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplyToEmailAddressSourceArn extends js.Object {
  var replyToEmailAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ReplyToEmailAddressSourceArn {
  @scala.inline
  def apply(
    replyToEmailAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ReplyToEmailAddressSourceArn = {
    val __obj = js.Dynamic.literal()
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress.asInstanceOf[js.Any])
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReplyToEmailAddressSourceArn]
  }
}

