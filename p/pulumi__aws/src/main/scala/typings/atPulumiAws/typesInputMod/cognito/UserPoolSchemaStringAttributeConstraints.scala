package typings.atPulumiAws.typesInputMod.cognito

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolSchemaStringAttributeConstraints extends js.Object {
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[Input[String]] = js.native
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[Input[String]] = js.native
}

object UserPoolSchemaStringAttributeConstraints {
  @scala.inline
  def apply(maxLength: Input[String] = null, minLength: Input[String] = null): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
}

