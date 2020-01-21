package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object ClientIPConfig {
  @scala.inline
  def apply(timeoutSeconds: Input[Double] = null): ClientIPConfig = {
    val __obj = js.Dynamic.literal()
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientIPConfig]
  }
}

