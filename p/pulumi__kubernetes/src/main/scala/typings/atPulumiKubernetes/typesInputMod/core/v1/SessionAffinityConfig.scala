package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var clientIP: js.UndefOr[Input[ClientIPConfig]] = js.undefined
}

object SessionAffinityConfig {
  @scala.inline
  def apply(clientIP: Input[ClientIPConfig] = null): SessionAffinityConfig = {
    val __obj = js.Dynamic.literal()
    if (clientIP != null) __obj.updateDynamic("clientIP")(clientIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAffinityConfig]
  }
}

