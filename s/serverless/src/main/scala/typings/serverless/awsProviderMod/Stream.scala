package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  var arn: String = js.native
  var batchSize: js.UndefOr[Double | String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var startingPosition: js.UndefOr[Double | String] = js.native
}

object Stream {
  @scala.inline
  def apply(arn: String): Stream = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  @scala.inline
  implicit class StreamOps[Self <: Stream] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchSize(value: Double | String): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setStartingPosition(value: Double | String): Self = this.set("startingPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingPosition: Self = this.set("startingPosition", js.undefined)
  }
  
}

