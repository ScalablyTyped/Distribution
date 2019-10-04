package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecBackend extends js.Object {
  /**
    * Specifies a virtual service to use as a backend for a virtual node.
    */
  var virtualService: js.UndefOr[VirtualNodeSpecBackendVirtualService] = js.undefined
}

object VirtualNodeSpecBackend {
  @scala.inline
  def apply(virtualService: VirtualNodeSpecBackendVirtualService = null): VirtualNodeSpecBackend = {
    val __obj = js.Dynamic.literal()
    if (virtualService != null) __obj.updateDynamic("virtualService")(virtualService)
    __obj.asInstanceOf[VirtualNodeSpecBackend]
  }
}

