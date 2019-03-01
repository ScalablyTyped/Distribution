package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStatement extends js.Object {
  var Action: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Condition: js.UndefOr[Conditions] = js.undefined
  var Effect: atPulumiAwsLib.atPulumiAwsLibStrings.Allow | atPulumiAwsLib.atPulumiAwsLibStrings.Deny
  var NotAction: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var NotPrincipal: js.UndefOr[Principal] = js.undefined
  var NotResource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Principal: js.UndefOr[Principal] = js.undefined
  var Resource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var Sid: js.UndefOr[java.lang.String] = js.undefined
}

object PolicyStatement {
  @scala.inline
  def apply(
    Effect: atPulumiAwsLib.atPulumiAwsLibStrings.Allow | atPulumiAwsLib.atPulumiAwsLibStrings.Deny,
    Action: java.lang.String | js.Array[java.lang.String] = null,
    Condition: Conditions = null,
    NotAction: java.lang.String | js.Array[java.lang.String] = null,
    NotPrincipal: Principal = null,
    NotResource: java.lang.String | js.Array[java.lang.String] = null,
    Principal: Principal = null,
    Resource: java.lang.String | js.Array[java.lang.String] = null,
    Sid: java.lang.String = null
  ): PolicyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Effect")(Effect.asInstanceOf[js.Any])
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

