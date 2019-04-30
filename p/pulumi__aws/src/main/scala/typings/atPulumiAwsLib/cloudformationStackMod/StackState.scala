package typings
package atPulumiAwsLib.cloudformationStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackState extends js.Object {
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
    */
  val capabilities: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `on_failure`.
    */
  val disableRollback: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Stack name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disable_rollback`.
    */
  val onFailure: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A map of outputs from the stack.
    */
  val outputs: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policy_url`.
    */
  val policyBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policy_body`.
    */
  val policyUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of tags to associate with this stack.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object StackState {
  @scala.inline
  def apply(
    capabilities: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    disableRollback: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    iamRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    notificationArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    onFailure: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    outputs: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    policyBody: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    templateBody: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    templateUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    timeoutInMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): StackState = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (disableRollback != null) __obj.updateDynamic("disableRollback")(disableRollback.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationArns != null) __obj.updateDynamic("notificationArns")(notificationArns.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (policyBody != null) __obj.updateDynamic("policyBody")(policyBody.asInstanceOf[js.Any])
    if (policyUrl != null) __obj.updateDynamic("policyUrl")(policyUrl.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (timeoutInMinutes != null) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackState]
  }
}

