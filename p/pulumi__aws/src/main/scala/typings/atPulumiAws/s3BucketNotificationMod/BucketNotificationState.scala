package typings.atPulumiAws.s3BucketNotificationMod

import typings.atPulumiAws.typesInputMod.s3.BucketNotificationLambdaFunction
import typings.atPulumiAws.typesInputMod.s3.BucketNotificationQueue
import typings.atPulumiAws.typesInputMod.s3.BucketNotificationTopic
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketNotificationState extends js.Object {
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: js.UndefOr[Input[js.Array[Input[BucketNotificationLambdaFunction]]]] = js.native
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: js.UndefOr[Input[js.Array[Input[BucketNotificationQueue]]]] = js.native
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: js.UndefOr[Input[js.Array[Input[BucketNotificationTopic]]]] = js.native
}

object BucketNotificationState {
  @scala.inline
  def apply(
    bucket: Input[String] = null,
    lambdaFunctions: Input[js.Array[Input[BucketNotificationLambdaFunction]]] = null,
    queues: Input[js.Array[Input[BucketNotificationQueue]]] = null,
    topics: Input[js.Array[Input[BucketNotificationTopic]]] = null
  ): BucketNotificationState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (lambdaFunctions != null) __obj.updateDynamic("lambdaFunctions")(lambdaFunctions.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketNotificationState]
  }
}

