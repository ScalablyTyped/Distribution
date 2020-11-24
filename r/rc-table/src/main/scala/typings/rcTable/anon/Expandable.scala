package typings.rcTable.anon

import typings.rcTable.interfaceMod.ExpandableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expandable[RecordType] extends js.Object {
  
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
}
object Expandable {
  
  @scala.inline
  def apply[RecordType](): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable[RecordType]]
  }
  
  @scala.inline
  implicit class ExpandableOps[Self <: Expandable[_], RecordType] (val x: Self with Expandable[RecordType]) extends AnyVal {
    
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
    def setExpandable(value: ExpandableConfig[RecordType]): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
  }
}
