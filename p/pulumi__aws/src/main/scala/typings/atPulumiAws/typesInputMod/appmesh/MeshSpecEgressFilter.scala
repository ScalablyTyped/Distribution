package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshSpecEgressFilter extends js.Object {
  /**
    * The egress filter type. By default, the type is `DROP_ALL`.
    * Valid values are `ALLOW_ALL` and `DROP_ALL`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object MeshSpecEgressFilter {
  @scala.inline
  def apply(`type`: Input[String] = null): MeshSpecEgressFilter = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshSpecEgressFilter]
  }
}

