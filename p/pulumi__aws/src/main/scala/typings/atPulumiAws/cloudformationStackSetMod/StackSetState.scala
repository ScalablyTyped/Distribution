package typings.atPulumiAws.cloudformationStackSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetState extends js.Object {
  /**
    * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
    */
  val administrationRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the Stack Set.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
    */
  val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Description of the Stack Set.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the IAM Role in all target accounts for Stack Set operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
    */
  val executionRoleName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the Stack Set. The name must be unique in the region where you create your Stack Set. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of input parameters for the Stack Set template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Unique identifier of the Stack Set.
    */
  val stackSetId: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of tags to associate with this Stack Set and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
    */
  val templateBody: js.UndefOr[Input[String]] = js.native
  /**
    * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
    */
  val templateUrl: js.UndefOr[Input[String]] = js.native
}

object StackSetState {
  @scala.inline
  def apply(
    administrationRoleArn: Input[String] = null,
    arn: Input[String] = null,
    capabilities: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    executionRoleName: Input[String] = null,
    name: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    stackSetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    templateBody: Input[String] = null,
    templateUrl: Input[String] = null
  ): StackSetState = {
    val __obj = js.Dynamic.literal()
    if (administrationRoleArn != null) __obj.updateDynamic("administrationRoleArn")(administrationRoleArn.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionRoleName != null) __obj.updateDynamic("executionRoleName")(executionRoleName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (stackSetId != null) __obj.updateDynamic("stackSetId")(stackSetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetState]
  }
}

