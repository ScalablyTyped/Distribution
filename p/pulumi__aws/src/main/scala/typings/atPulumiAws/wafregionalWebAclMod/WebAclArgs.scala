package typings.atPulumiAws.wafregionalWebAclMod

import typings.atPulumiAws.typesInputMod.wafregionalNs.WebAclDefaultAction
import typings.atPulumiAws.typesInputMod.wafregionalNs.WebAclLoggingConfiguration
import typings.atPulumiAws.typesInputMod.wafregionalNs.WebAclRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclArgs extends js.Object {
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: Input[WebAclDefaultAction]
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.undefined
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: Input[String]
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.undefined
}

object WebAclArgs {
  @scala.inline
  def apply(
    defaultAction: Input[WebAclDefaultAction],
    metricName: Input[String],
    loggingConfiguration: Input[WebAclLoggingConfiguration] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[WebAclRule]]] = null
  ): WebAclArgs = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclArgs]
  }
}

