package typings
package atPulumiAwsLib.ssmParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterArgs extends js.Object {
  /**
    * A regular expression used to validate the parameter value.
    */
  val allowedPattern: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the parameter.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the parameter.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The KMS key id or arn for encrypting a SecureString.
    */
  val keyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by terraform to avoid overwrite of existing resource and will default to `true` otherwise (terraform lifecycle rules should then be used to manage the update behavior).
    */
  val overwrite: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The value of the parameter.
    */
  val value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ParameterArgs {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowedPattern: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    overwrite: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ParameterArgs = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (allowedPattern != null) __obj.updateDynamic("allowedPattern")(allowedPattern.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterArgs]
  }
}

