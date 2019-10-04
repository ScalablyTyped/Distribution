package typings.atPulumiAws.wafWebAclMod

import typings.atPulumiAws.typesInputMod.wafNs.WebAclDefaultAction
import typings.atPulumiAws.typesInputMod.wafNs.WebAclLoggingConfiguration
import typings.atPulumiAws.typesInputMod.wafNs.WebAclRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
    */
  val defaultAction: js.UndefOr[Input[WebAclDefaultAction]] = js.undefined
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.undefined
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.undefined
}

object WebAclState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    defaultAction: Input[WebAclDefaultAction] = null,
    loggingConfiguration: Input[WebAclLoggingConfiguration] = null,
    metricName: Input[String] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[WebAclRule]]] = null
  ): WebAclState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (defaultAction != null) __obj.updateDynamic("defaultAction")(defaultAction.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclState]
  }
}

