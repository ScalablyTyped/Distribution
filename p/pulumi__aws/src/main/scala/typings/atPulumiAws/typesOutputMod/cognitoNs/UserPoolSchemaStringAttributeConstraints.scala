package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolSchemaStringAttributeConstraints extends js.Object {
  /**
    * The maximum length of an attribute value of the string type.
    */
  var maxLength: js.UndefOr[String] = js.undefined
  /**
    * The minimum length of an attribute value of the string type.
    */
  var minLength: js.UndefOr[String] = js.undefined
}

object UserPoolSchemaStringAttributeConstraints {
  @scala.inline
  def apply(maxLength: String = null, minLength: String = null): UserPoolSchemaStringAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength)
    __obj.asInstanceOf[UserPoolSchemaStringAttributeConstraints]
  }
}

