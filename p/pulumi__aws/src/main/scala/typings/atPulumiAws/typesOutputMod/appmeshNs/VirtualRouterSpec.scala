package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    * Currently only one listener is supported per virtual router.
    */
  var listener: VirtualRouterSpecListener
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listener: VirtualRouterSpecListener): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listener = listener)
  
    __obj.asInstanceOf[VirtualRouterSpec]
  }
}

