package typings.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
trait AllowedCSIDriver extends js.Object {
  /**
    * Name is the registered name of the CSI driver
    */
  val name: String
}

object AllowedCSIDriver {
  @scala.inline
  def apply(name: String): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllowedCSIDriver]
  }
}

