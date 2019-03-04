package typings
package atPulumiAwsLib.wafregionalWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclArgs extends js.Object {
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput]
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LogDestinationRedactedFields]
  ] = js.undefined
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ]
  ] = js.undefined
}

object WebAclArgs {
  @scala.inline
  def apply(
    defaultAction: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput],
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    loggingConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LogDestinationRedactedFields] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rules: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ] = null
  ): WebAclArgs = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    if (loggingConfiguration != null) __obj.updateDynamic("loggingConfiguration")(loggingConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclArgs]
  }
}

