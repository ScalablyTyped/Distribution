package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTypeIncludeBody extends js.Object {
  var eventType: Input[String]
  var includeBody: js.UndefOr[Input[Boolean]] = js.undefined
  var lambdaArn: Input[String]
}

object Anon_EventTypeIncludeBody {
  @scala.inline
  def apply(eventType: Input[String], lambdaArn: Input[String], includeBody: Input[Boolean] = null): Anon_EventTypeIncludeBody = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    if (includeBody != null) __obj.updateDynamic("includeBody")(includeBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventTypeIncludeBody]
  }
}

