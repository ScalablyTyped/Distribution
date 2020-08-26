package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClientIPConfig represents the configurations of Client IP based session affinity.
  */
@js.native
trait ClientIPConfig extends js.Object {
  /**
    * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object ClientIPConfig {
  @scala.inline
  def apply(): ClientIPConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientIPConfig]
  }
  @scala.inline
  implicit class ClientIPConfigOps[Self <: ClientIPConfig] (val x: Self) extends AnyVal {
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
    def setTimeoutSeconds(value: Input[Double]): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
  
}

