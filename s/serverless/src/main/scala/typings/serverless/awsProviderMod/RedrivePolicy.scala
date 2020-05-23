package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedrivePolicy extends js.Object {
  var deadLetterTargetArn: js.UndefOr[String] = js.undefined
  var deadLetterTargetImport: js.UndefOr[DeadLetterTargetImport] = js.undefined
  var deadLetterTargetRef: js.UndefOr[String] = js.undefined
}

object RedrivePolicy {
  @scala.inline
  def apply(
    deadLetterTargetArn: String = null,
    deadLetterTargetImport: DeadLetterTargetImport = null,
    deadLetterTargetRef: String = null
  ): RedrivePolicy = {
    val __obj = js.Dynamic.literal()
    if (deadLetterTargetArn != null) __obj.updateDynamic("deadLetterTargetArn")(deadLetterTargetArn.asInstanceOf[js.Any])
    if (deadLetterTargetImport != null) __obj.updateDynamic("deadLetterTargetImport")(deadLetterTargetImport.asInstanceOf[js.Any])
    if (deadLetterTargetRef != null) __obj.updateDynamic("deadLetterTargetRef")(deadLetterTargetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrivePolicy]
  }
}

