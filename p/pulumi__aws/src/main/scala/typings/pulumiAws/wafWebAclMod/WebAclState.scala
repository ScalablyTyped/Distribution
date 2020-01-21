package typings.pulumiAws.wafWebAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.waf.WebAclDefaultAction
import typings.pulumiAws.inputMod.waf.WebAclLoggingConfiguration
import typings.pulumiAws.inputMod.waf.WebAclRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclState extends js.Object {
  /**
    * The ARN of the WAF WebACL.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
    */
  val defaultAction: js.UndefOr[Input[WebAclDefaultAction]] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[Input[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
    */
  val rules: js.UndefOr[Input[js.Array[Input[WebAclRule]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object WebAclState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    defaultAction: Input[WebAclDefaultAction] = null,
    loggingConfiguration: Input[WebAclLoggingConfiguration] = null,
    metricName: Input[String] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[WebAclRule]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): WebAclState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (defaultAction != null) __obj.updateDynamic("defaultAction")(defaultAction.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclState]
  }
}

