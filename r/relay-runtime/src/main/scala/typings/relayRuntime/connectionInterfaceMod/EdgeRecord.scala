package typings.relayRuntime.connectionInterfaceMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: unknown} */ @js.native
trait EdgeRecord extends js.Object {
  var cursor: js.Any = js.native
  var node: Record[DataID, _] = js.native
}

object EdgeRecord {
  @scala.inline
  def apply(cursor: js.Any, node: Record[DataID, _]): EdgeRecord = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeRecord]
  }
  @scala.inline
  implicit class EdgeRecordOps[Self <: EdgeRecord] (val x: Self) extends AnyVal {
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
    def setCursor(value: js.Any): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Record[DataID, _]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

