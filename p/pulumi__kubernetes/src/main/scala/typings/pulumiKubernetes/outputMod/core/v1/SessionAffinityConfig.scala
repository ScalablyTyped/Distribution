package typings.pulumiKubernetes.outputMod.core.v1

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
  var clientIP: ClientIPConfig = js.native
}

object SessionAffinityConfig {
  @scala.inline
  def apply(clientIP: ClientIPConfig): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal(clientIP = clientIP.asInstanceOf[js.Any])
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
    def setClientIP(value: ClientIPConfig): Self = this.set("clientIP", value.asInstanceOf[js.Any])
  }
  
}

