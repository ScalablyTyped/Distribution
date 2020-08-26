package typings.sqsProducer.mod

import typings.awsSdk.mod.SQS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.native
  var batchSize: js.UndefOr[Double] = js.native
  var queueUrl: String = js.native
  var region: js.UndefOr[String] = js.native
  var secretAccessKey: js.UndefOr[String] = js.native
  var sqs: js.UndefOr[SQS] = js.native
}

object Options {
  @scala.inline
  def apply(queueUrl: String): Options = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setQueueUrl(value: String): Self = this.set("queueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    @scala.inline
    def setSqs(value: SQS): Self = this.set("sqs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqs: Self = this.set("sqs", js.undefined)
  }
  
}

