package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcePolicy extends js.Object {
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var Condition: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var Effect: Allow | Deny
  var Principal: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
}

object ResourcePolicy {
  @scala.inline
  def apply(
    Effect: Allow | Deny,
    Action: String | js.Array[String] | StringDictionary[js.Any] = null,
    Condition: StringDictionary[js.Any] = null,
    Principal: String | js.Array[String] | StringDictionary[js.Any] = null,
    Resource: String | js.Array[String] | StringDictionary[js.Any] = null
  ): ResourcePolicy = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
}

