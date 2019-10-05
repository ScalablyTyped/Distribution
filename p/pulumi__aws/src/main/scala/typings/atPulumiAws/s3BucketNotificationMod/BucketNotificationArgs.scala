package typings.atPulumiAws.s3BucketNotificationMod

import typings.atPulumiAws.typesInputMod.s3.BucketNotificationLambdaFunction
import typings.atPulumiAws.typesInputMod.s3.BucketNotificationQueue
import typings.atPulumiAws.typesInputMod.s3.BucketNotificationTopic
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketNotificationArgs extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: Input[String]
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: js.UndefOr[Input[js.Array[Input[BucketNotificationLambdaFunction]]]] = js.undefined
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: js.UndefOr[Input[js.Array[Input[BucketNotificationQueue]]]] = js.undefined
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: js.UndefOr[Input[js.Array[Input[BucketNotificationTopic]]]] = js.undefined
}

object BucketNotificationArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    lambdaFunctions: Input[js.Array[Input[BucketNotificationLambdaFunction]]] = null,
    queues: Input[js.Array[Input[BucketNotificationQueue]]] = null,
    topics: Input[js.Array[Input[BucketNotificationTopic]]] = null
  ): BucketNotificationArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (lambdaFunctions != null) __obj.updateDynamic("lambdaFunctions")(lambdaFunctions.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationArgs]
  }
}

