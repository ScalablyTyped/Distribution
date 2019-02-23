package typings
package atPulumiAwsLib.s3BucketNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationState extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
      ]
    ]
  ] = js.undefined
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdQueueArn]
      ]
    ]
  ] = js.undefined
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdTopicArn]
      ]
    ]
  ] = js.undefined
}

