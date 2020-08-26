package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookThrottleConfig holds the configuration for throttling events
  */
@js.native
trait WebhookThrottleConfig extends js.Object {
  /**
    * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
    */
  var burst: js.UndefOr[Input[Double]] = js.native
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  var qps: js.UndefOr[Input[Double]] = js.native
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
  @scala.inline
  implicit class WebhookThrottleConfigOps[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
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
    def setBurst(value: Input[Double]): Self = this.set("burst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurst: Self = this.set("burst", js.undefined)
    @scala.inline
    def setQps(value: Input[Double]): Self = this.set("qps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQps: Self = this.set("qps", js.undefined)
  }
  
}

