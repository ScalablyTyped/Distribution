package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualNodeVirtualRouter extends js.Object {
  var virtualNode: js.UndefOr[Anon_VirtualNodeName] = js.undefined
  var virtualRouter: js.UndefOr[Anon_VirtualRouterName] = js.undefined
}

object Anon_VirtualNodeVirtualRouter {
  @scala.inline
  def apply(virtualNode: Anon_VirtualNodeName = null, virtualRouter: Anon_VirtualRouterName = null): Anon_VirtualNodeVirtualRouter = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode)
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter)
    __obj.asInstanceOf[Anon_VirtualNodeVirtualRouter]
  }
}

