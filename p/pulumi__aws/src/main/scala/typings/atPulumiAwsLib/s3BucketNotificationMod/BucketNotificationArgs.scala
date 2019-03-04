package typings
package atPulumiAwsLib.s3BucketNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationArgs extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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

object BucketNotificationArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    lambdaFunctions: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdLambdaFunctionArn]
      ]
    ] = null,
    queues: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdQueueArn]
      ]
    ] = null,
    topics: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EventsFilterPrefixFilterSuffixIdTopicArn]
      ]
    ] = null
  ): BucketNotificationArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (lambdaFunctions != null) __obj.updateDynamic("lambdaFunctions")(lambdaFunctions.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationArgs]
  }
}

