package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
trait SessionAffinityConfig extends js.Object {
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  val clientIP: ClientIPConfig
}

object SessionAffinityConfig {
  @scala.inline
  def apply(clientIP: ClientIPConfig): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal(clientIP = clientIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAffinityConfig]
  }
}

