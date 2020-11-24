package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangeLogEntry extends js.Object {
  
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[Uint8Array | Null] = js.native
  
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.native
}
object IChangeLogEntry {
  
  @scala.inline
  def apply(): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangeLogEntry]
  }
  
  @scala.inline
  implicit class IChangeLogEntryOps[Self <: IChangeLogEntry] (val x: Self) extends AnyVal {
    
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
    def setAdditionsVarargs(value: Uint8Array*): Self = this.set("additions", js.Array(value :_*))
    
    @scala.inline
    def setAdditions(value: js.Array[Uint8Array]): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditions: Self = this.set("additions", js.undefined)
    
    @scala.inline
    def setAdditionsNull: Self = this.set("additions", null)
    
    @scala.inline
    def setParent(value: Uint8Array): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setSuccessorsVarargs(value: ISuccessor*): Self = this.set("successors", js.Array(value :_*))
    
    @scala.inline
    def setSuccessors(value: js.Array[ISuccessor]): Self = this.set("successors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessors: Self = this.set("successors", js.undefined)
    
    @scala.inline
    def setSuccessorsNull: Self = this.set("successors", null)
  }
}
