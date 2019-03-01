package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClientIPConfig represents the configurations of Client IP based session affinity.
  */
trait ClientIPConfig extends js.Object {
  /**
    * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must
    * be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3
    * hours).
    */
  val timeoutSeconds: scala.Double
}

object ClientIPConfig {
  @scala.inline
  def apply(timeoutSeconds: scala.Double): ClientIPConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeoutSeconds")(timeoutSeconds)
    __obj.asInstanceOf[ClientIPConfig]
  }
}

