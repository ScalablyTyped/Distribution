package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSpecEgressFilter extends js.Object {
  /**
    * The egress filter type. By default, the type is `DROP_ALL`.
    * Valid values are `ALLOW_ALL` and `DROP_ALL`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MeshSpecEgressFilter {
  @scala.inline
  def apply(): MeshSpecEgressFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpecEgressFilter]
  }
  @scala.inline
  implicit class MeshSpecEgressFilterOps[Self <: MeshSpecEgressFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

