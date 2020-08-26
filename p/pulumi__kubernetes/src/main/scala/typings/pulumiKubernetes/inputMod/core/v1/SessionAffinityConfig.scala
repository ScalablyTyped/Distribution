package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
@js.native
trait SessionAffinityConfig extends js.Object {
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: js.UndefOr[Input[ClientIPConfig]] = js.native
}

object SessionAffinityConfig {
  @scala.inline
  def apply(): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAffinityConfig]
  }
  @scala.inline
  implicit class SessionAffinityConfigOps[Self <: SessionAffinityConfig] (val x: Self) extends AnyVal {
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
    def setClientIP(value: Input[ClientIPConfig]): Self = this.set("clientIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientIP: Self = this.set("clientIP", js.undefined)
  }
  
}

