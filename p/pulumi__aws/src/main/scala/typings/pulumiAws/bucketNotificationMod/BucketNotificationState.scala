package typings.pulumiAws.bucketNotificationMod

import typings.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction
import typings.pulumiAws.inputMod.s3.BucketNotificationQueue
import typings.pulumiAws.inputMod.s3.BucketNotificationTopic
import typings.pulumiPulumi.outputMod.Input
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
  def apply(): BucketNotificationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketNotificationState]
  }
  @scala.inline
  implicit class BucketNotificationStateOps[Self <: BucketNotificationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setLambdaFunctionsVarargs(value: Input[BucketNotificationLambdaFunction]*): Self = this.set("lambdaFunctions", js.Array(value :_*))
    @scala.inline
    def setLambdaFunctions(value: Input[js.Array[Input[BucketNotificationLambdaFunction]]]): Self = this.set("lambdaFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctions: Self = this.set("lambdaFunctions", js.undefined)
    @scala.inline
    def setQueuesVarargs(value: Input[BucketNotificationQueue]*): Self = this.set("queues", js.Array(value :_*))
    @scala.inline
    def setQueues(value: Input[js.Array[Input[BucketNotificationQueue]]]): Self = this.set("queues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueues: Self = this.set("queues", js.undefined)
    @scala.inline
    def setTopicsVarargs(value: Input[BucketNotificationTopic]*): Self = this.set("topics", js.Array(value :_*))
    @scala.inline
    def setTopics(value: Input[js.Array[Input[BucketNotificationTopic]]]): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
  
}

