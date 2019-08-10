package typings.atPulumiAws.cloudformationStackMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackArgs extends js.Object {
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
    */
  val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `onFailure`.
    */
  val disableRollback: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Stack name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
    */
  val onFailure: js.UndefOr[Input[String]] = js.undefined
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policyUrl`.
    */
  val policyBody: js.UndefOr[Input[String]] = js.undefined
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policyBody`.
    */
  val policyUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of tags to associate with this stack.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: js.UndefOr[Input[String]] = js.undefined
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: js.UndefOr[Input[Double]] = js.undefined
}

object StackArgs {
  @scala.inline
  def apply(
    capabilities: Input[js.Array[Input[String]]] = null,
    disableRollback: Input[Boolean] = null,
    iamRoleArn: Input[String] = null,
    name: Input[String] = null,
    notificationArns: Input[js.Array[Input[String]]] = null,
    onFailure: Input[String] = null,
    parameters: Input[StringDictionary[_]] = null,
    policyBody: Input[String] = null,
    policyUrl: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    templateBody: Input[String] = null,
    templateUrl: Input[String] = null,
    timeoutInMinutes: Input[Double] = null
  ): StackArgs = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (disableRollback != null) __obj.updateDynamic("disableRollback")(disableRollback.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationArns != null) __obj.updateDynamic("notificationArns")(notificationArns.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (policyBody != null) __obj.updateDynamic("policyBody")(policyBody.asInstanceOf[js.Any])
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (timeoutInMinutes != null) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackArgs]
  }
}

