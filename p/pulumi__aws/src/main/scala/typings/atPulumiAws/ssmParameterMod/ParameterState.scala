package typings.atPulumiAws.ssmParameterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.ssmParameterTypeMod.ParameterType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterState extends js.Object {
  /**
    * A regular expression used to validate the parameter value.
    */
  val allowedPattern: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the parameter.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the parameter.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The KMS key id or arn for encrypting a SecureString.
    */
  val keyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val overwrite: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
    */
  val tier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
    */
  val `type`: js.UndefOr[Input[ParameterType]] = js.undefined
  /**
    * The value of the parameter.
    */
  val value: js.UndefOr[Input[String]] = js.undefined
  /**
    * The version of the parameter.
    */
  val version: js.UndefOr[Input[Double]] = js.undefined
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

