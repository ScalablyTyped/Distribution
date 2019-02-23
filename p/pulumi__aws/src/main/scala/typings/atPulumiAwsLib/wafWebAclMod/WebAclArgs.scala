package typings
package atPulumiAwsLib.wafWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclArgs extends js.Object {
  /**
    * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
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
    * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
    */
  val rules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ]
  ] = js.undefined
}

