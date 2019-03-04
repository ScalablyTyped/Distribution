package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTypeIncludeBody extends js.Object {
  var eventType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var includeBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var lambdaArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EventTypeIncludeBody {
  @scala.inline
  def apply(
    eventType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    lambdaArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    includeBody: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_EventTypeIncludeBody = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    if (includeBody != null) __obj.updateDynamic("includeBody")(includeBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventTypeIncludeBody]
  }
}

