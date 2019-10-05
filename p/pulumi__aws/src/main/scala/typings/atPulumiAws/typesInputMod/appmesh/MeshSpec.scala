package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshSpec extends js.Object {
  var egressFilter: js.UndefOr[Input[MeshSpecEgressFilter]] = js.undefined
}

object MeshSpec {
  @scala.inline
  def apply(egressFilter: Input[MeshSpecEgressFilter] = null): MeshSpec = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshSpec]
  }
}

