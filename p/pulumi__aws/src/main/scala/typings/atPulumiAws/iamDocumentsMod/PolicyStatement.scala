package typings.atPulumiAws.iamDocumentsMod

import typings.atPulumiAws.atPulumiAwsStrings.Allow
import typings.atPulumiAws.atPulumiAwsStrings.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStatement extends js.Object {
  var Action: js.UndefOr[String | js.Array[String]] = js.undefined
  var Condition: js.UndefOr[Conditions] = js.undefined
  var Effect: Allow | Deny
  var NotAction: js.UndefOr[String | js.Array[String]] = js.undefined
  var NotPrincipal: js.UndefOr[Principal] = js.undefined
  var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  var Principal: js.UndefOr[typings.atPulumiAws.iamDocumentsMod.Principal] = js.undefined
  var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
  var Sid: js.UndefOr[String] = js.undefined
}

object PolicyStatement {
  @scala.inline
  def apply(
    Effect: Allow | Deny,
    Action: String | js.Array[String] = null,
    Condition: Conditions = null,
    NotAction: String | js.Array[String] = null,
    NotPrincipal: Principal = null,
    NotResource: String | js.Array[String] = null,
    Principal: Principal = null,
    Resource: String | js.Array[String] = null,
    Sid: String = null
  ): PolicyStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    if (NotAction != null) __obj.updateDynamic("NotAction")(NotAction.asInstanceOf[js.Any])
    if (NotPrincipal != null) __obj.updateDynamic("NotPrincipal")(NotPrincipal)
    if (NotResource != null) __obj.updateDynamic("NotResource")(NotResource.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (Sid != null) __obj.updateDynamic("Sid")(Sid)
    __obj.asInstanceOf[PolicyStatement]
  }
}

