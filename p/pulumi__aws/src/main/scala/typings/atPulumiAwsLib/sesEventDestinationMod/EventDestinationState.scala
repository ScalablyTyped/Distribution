package typings
package atPulumiAwsLib.sesEventDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDestinationState extends js.Object {
  /**
    * CloudWatch destination for the events
    */
  val cloudwatchDestinations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultValueDimensionNameValueSource]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the configuration set
    */
  val configurationSetName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true, the event destination will be enabled
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Send the events to a kinesis firehose destination
    */
  val kinesisDestination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RoleArnStreamArnInput]] = js.undefined
  /**
    * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
    */
  val matchingTypes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the event destination
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Send the events to an SNS Topic destination
    */
  val snsDestination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TopicArnInput]] = js.undefined
}

