package typings
package atPulumiAwsLib.sesReceiptRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleArgs extends js.Object {
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HeaderName]]]
  ] = js.undefined
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_StatusCodeTopicArn]]
    ]
  ] = js.undefined
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_InvocationType]]
    ]
  ] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ObjectKeyPrefix]]
    ]
  ] = js.undefined
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PositionTopicArn]]
    ]
  ] = js.undefined
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Position]]]
  ] = js.undefined
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_OrganizationArn]]
    ]
  ] = js.undefined
}

