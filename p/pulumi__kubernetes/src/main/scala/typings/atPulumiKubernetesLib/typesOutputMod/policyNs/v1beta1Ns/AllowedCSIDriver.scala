package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

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
  val name: java.lang.String
}

object AllowedCSIDriver {
  @scala.inline
  def apply(name: java.lang.String): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[AllowedCSIDriver]
  }
}

