package typings.pulumiAws.documentsMod

import typings.pulumiAws.pulumiAwsStrings.Allow
import typings.pulumiAws.pulumiAwsStrings.Deny
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStatement extends js.Object {
  var Action: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Condition: js.UndefOr[Input[Conditions]] = js.native
  var Effect: Input[Allow | Deny] = js.native
  var NotAction: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var NotPrincipal: js.UndefOr[Input[Principal]] = js.native
  var NotResource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Principal: js.UndefOr[Input[typings.pulumiAws.documentsMod.Principal]] = js.native
  var Resource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Sid: js.UndefOr[Input[String]] = js.native
}

object PolicyStatement {
  @scala.inline
  def apply(
    Effect: Input[Allow | Deny],
    Action: Input[js.Array[Input[String]] | String] = null,
    Condition: Input[Conditions] = null,
    NotAction: Input[js.Array[Input[String]] | String] = null,
    NotPrincipal: Input[Principal] = null,
    NotResource: Input[js.Array[Input[String]] | String] = null,
    Principal: Input[Principal] = null,
    Resource: Input[js.Array[Input[String]] | String] = null,
    Sid: Input[String] = null
  ): PolicyStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (NotAction != null) __obj.updateDynamic("NotAction")(NotAction.asInstanceOf[js.Any])
    if (NotPrincipal != null) __obj.updateDynamic("NotPrincipal")(NotPrincipal.asInstanceOf[js.Any])
    if (NotResource != null) __obj.updateDynamic("NotResource")(NotResource.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (Sid != null) __obj.updateDynamic("Sid")(Sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStatement]
  }
}

