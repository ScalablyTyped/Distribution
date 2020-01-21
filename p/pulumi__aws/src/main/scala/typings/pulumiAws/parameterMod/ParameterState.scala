package typings.pulumiAws.parameterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.parameterTypeMod.ParameterType
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterState extends js.Object {
  /**
    * A regular expression used to validate the parameter value.
    */
  val allowedPattern: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the parameter.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the parameter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The KMS key id or arn for encrypting a SecureString.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
    */
  val overwrite: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
    */
  val tier: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
    */
  val `type`: js.UndefOr[Input[ParameterType]] = js.native
  /**
    * The value of the parameter.
    */
  val value: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the parameter.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object ParameterState {
  @scala.inline
  def apply(
    allowedPattern: Input[String] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    keyId: Input[String] = null,
    name: Input[String] = null,
    overwrite: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    tier: Input[String] = null,
    `type`: Input[ParameterType] = null,
    value: Input[String] = null,
    version: Input[Double] = null
  ): ParameterState = {
    val __obj = js.Dynamic.literal()
    if (allowedPattern != null) __obj.updateDynamic("allowedPattern")(allowedPattern.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterState]
  }
}

