package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSpec extends js.Object {
  var egressFilter: js.UndefOr[Input[MeshSpecEgressFilter]] = js.native
}

object MeshSpec {
  @scala.inline
  def apply(egressFilter: Input[MeshSpecEgressFilter] = null): MeshSpec = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshSpec]
  }
}

