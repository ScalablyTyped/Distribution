package typings.sqsConsumer.consumerMod

import typings.awsSdk.sqsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerOptions extends js.Object {
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  var authenticationErrorTimeout: js.UndefOr[Double] = js.native
  var batchSize: js.UndefOr[Double] = js.native
  var handleMessage: js.UndefOr[js.Function1[/* message */ SQSMessage, js.Promise[Unit]]] = js.native
  var handleMessageBatch: js.UndefOr[js.Function1[/* messages */ js.Array[SQSMessage], js.Promise[Unit]]] = js.native
  var handleMessageTimeout: js.UndefOr[Double] = js.native
  var messageAttributeNames: js.UndefOr[js.Array[String]] = js.native
  var pollingWaitTimeMs: js.UndefOr[Double] = js.native
  var queueUrl: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var sqs: js.UndefOr[^] = js.native
  var stopped: js.UndefOr[Boolean] = js.native
  var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.native
  var visibilityTimeout: js.UndefOr[Double] = js.native
  var waitTimeSeconds: js.UndefOr[Double] = js.native
}

object ConsumerOptions {
  @scala.inline
  def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  @scala.inline
  implicit class ConsumerOptionsOps[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: String*): Self = this.set("attributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: js.Array[String]): Self = this.set("attributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeNames: Self = this.set("attributeNames", js.undefined)
    @scala.inline
    def setAuthenticationErrorTimeout(value: Double): Self = this.set("authenticationErrorTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationErrorTimeout: Self = this.set("authenticationErrorTimeout", js.undefined)
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setHandleMessage(value: /* message */ SQSMessage => js.Promise[Unit]): Self = this.set("handleMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleMessage: Self = this.set("handleMessage", js.undefined)
    @scala.inline
    def setHandleMessageBatch(value: /* messages */ js.Array[SQSMessage] => js.Promise[Unit]): Self = this.set("handleMessageBatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleMessageBatch: Self = this.set("handleMessageBatch", js.undefined)
    @scala.inline
    def setHandleMessageTimeout(value: Double): Self = this.set("handleMessageTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleMessageTimeout: Self = this.set("handleMessageTimeout", js.undefined)
    @scala.inline
    def setMessageAttributeNamesVarargs(value: String*): Self = this.set("messageAttributeNames", js.Array(value :_*))
    @scala.inline
    def setMessageAttributeNames(value: js.Array[String]): Self = this.set("messageAttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageAttributeNames: Self = this.set("messageAttributeNames", js.undefined)
    @scala.inline
    def setPollingWaitTimeMs(value: Double): Self = this.set("pollingWaitTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingWaitTimeMs: Self = this.set("pollingWaitTimeMs", js.undefined)
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("queueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueUrl: Self = this.set("queueUrl", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSqs(value: ^): Self = this.set("sqs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
    @scala.inline
    def setStopped(value: Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopped: Self = this.set("stopped", js.undefined)
    @scala.inline
    def setTerminateVisibilityTimeout(value: Boolean): Self = this.set("terminateVisibilityTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateVisibilityTimeout: Self = this.set("terminateVisibilityTimeout", js.undefined)
    @scala.inline
    def setVisibilityTimeout(value: Double): Self = this.set("visibilityTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityTimeout: Self = this.set("visibilityTimeout", js.undefined)
    @scala.inline
    def setWaitTimeSeconds(value: Double): Self = this.set("waitTimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitTimeSeconds: Self = this.set("waitTimeSeconds", js.undefined)
  }
  
}

