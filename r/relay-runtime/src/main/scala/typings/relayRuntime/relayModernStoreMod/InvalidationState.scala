package typings.relayRuntime.relayModernStoreMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidationState extends js.Object {
  var dataIDs: js.Array[DataID] = js.native
  var invalidations: Map[DataID, js.UndefOr[Double | Null]] = js.native
}

object InvalidationState {
  @scala.inline
  def apply(dataIDs: js.Array[DataID], invalidations: Map[DataID, js.UndefOr[Double | Null]]): InvalidationState = {
    val __obj = js.Dynamic.literal(dataIDs = dataIDs.asInstanceOf[js.Any], invalidations = invalidations.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationState]
  }
  @scala.inline
  implicit class InvalidationStateOps[Self <: InvalidationState] (val x: Self) extends AnyVal {
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
    def setDataIDsVarargs(value: DataID*): Self = this.set("dataIDs", js.Array(value :_*))
    @scala.inline
    def setDataIDs(value: js.Array[DataID]): Self = this.set("dataIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidations(value: Map[DataID, js.UndefOr[Double | Null]]): Self = this.set("invalidations", value.asInstanceOf[js.Any])
  }
  
}

