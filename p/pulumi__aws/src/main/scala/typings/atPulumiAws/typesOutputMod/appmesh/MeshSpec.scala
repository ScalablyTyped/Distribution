package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshSpec extends js.Object {
  var egressFilter: js.UndefOr[MeshSpecEgressFilter] = js.undefined
}

object MeshSpec {
  @scala.inline
  def apply(egressFilter: MeshSpecEgressFilter = null): MeshSpec = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter)
    __obj.asInstanceOf[MeshSpec]
  }
}

