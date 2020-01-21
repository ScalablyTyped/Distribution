package typings.pulumiKubernetes.outputMod.storage.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
  */
trait CSINodeSpec extends js.Object {
  /**
    * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in
    * the list are uninstalled, this can become empty.
    */
  val drivers: js.Array[CSINodeDriver]
}

object CSINodeSpec {
  @scala.inline
  def apply(drivers: js.Array[CSINodeDriver]): CSINodeSpec = {
    val __obj = js.Dynamic.literal(drivers = drivers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CSINodeSpec]
  }
}

