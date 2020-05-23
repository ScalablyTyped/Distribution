package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.Allow
import typings.serverless.serverlessStrings.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IamRoleStatement extends js.Object {
  var Action: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var Condition: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var Effect: Allow | Deny
  var NotAction: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var NotResource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var Resource: js.UndefOr[String | js.Array[String] | StringDictionary[js.Any]] = js.undefined
  var Sid: js.UndefOr[String] = js.undefined
}

object IamRoleStatement {
  @scala.inline
  def apply(
    Effect: Allow | Deny,
    Action: String | js.Array[String] | StringDictionary[js.Any] = null,
    Condition: StringDictionary[js.Any] = null,
    NotAction: String | js.Array[String] | StringDictionary[js.Any] = null,
    NotResource: String | js.Array[String] | StringDictionary[js.Any] = null,
    Resource: String | js.Array[String] | StringDictionary[js.Any] = null,
    Sid: String = null
  ): IamRoleStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (NotAction != null) __obj.updateDynamic("NotAction")(NotAction.asInstanceOf[js.Any])
    if (NotResource != null) __obj.updateDynamic("NotResource")(NotResource.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (Sid != null) __obj.updateDynamic("Sid")(Sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamRoleStatement]
  }
}

