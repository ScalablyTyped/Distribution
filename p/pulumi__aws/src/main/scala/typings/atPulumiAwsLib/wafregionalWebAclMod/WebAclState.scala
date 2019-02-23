package typings
package atPulumiAwsLib.wafregionalWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the WAF Regional WebACL.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TypeInput]] = js.undefined
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_LogDestinationRedactedFields]
  ] = js.undefined
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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

