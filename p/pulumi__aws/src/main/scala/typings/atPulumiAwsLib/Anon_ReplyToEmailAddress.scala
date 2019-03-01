package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplyToEmailAddress extends js.Object {
  var replyToEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  var sourceArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ReplyToEmailAddress {
  @scala.inline
  def apply(replyToEmailAddress: java.lang.String = null, sourceArn: java.lang.String = null): Anon_ReplyToEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress)
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn)
    __obj.asInstanceOf[Anon_ReplyToEmailAddress]
  }
}

