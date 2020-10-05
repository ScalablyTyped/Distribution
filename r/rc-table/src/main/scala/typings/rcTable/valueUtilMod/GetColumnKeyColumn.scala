package typings.rcTable.valueUtilMod

import typings.rcTable.interfaceMod.DataIndex
import typings.rcTable.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetColumnKeyColumn extends js.Object {
  var dataIndex: js.UndefOr[DataIndex] = js.native
  var key: js.UndefOr[Key] = js.native
}

object GetColumnKeyColumn {
  @scala.inline
  def apply(): GetColumnKeyColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetColumnKeyColumn]
  }
  @scala.inline
  implicit class GetColumnKeyColumnOps[Self <: GetColumnKeyColumn] (val x: Self) extends AnyVal {
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
    def setDataIndexVarargs(value: (String | Double)*): Self = this.set("dataIndex", js.Array(value :_*))
    @scala.inline
    def setDataIndex(value: DataIndex): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

