package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableReplica extends js.Object {
  var regionName: String = js.native
}

object GetTableReplica {
  @scala.inline
  def apply(regionName: String): GetTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableReplica]
  }
  @scala.inline
  implicit class GetTableReplicaOps[Self <: GetTableReplica] (val x: Self) extends AnyVal {
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
    def setRegionName(value: String): Self = this.set("regionName", value.asInstanceOf[js.Any])
  }
  
}

