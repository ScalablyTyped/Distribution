package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangeLogEntry extends StObject {
  
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
  implicit class IChangeLogEntryMutableBuilder[Self <: IChangeLogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: js.Array[Uint8Array]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionsNull: Self = StObject.set(x, "additions", null)
    
    @scala.inline
    def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    @scala.inline
    def setAdditionsVarargs(value: Uint8Array*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Uint8Array): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSuccessors(value: js.Array[ISuccessor]): Self = StObject.set(x, "successors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessorsNull: Self = StObject.set(x, "successors", null)
    
    @scala.inline
    def setSuccessorsUndefined: Self = StObject.set(x, "successors", js.undefined)
    
    @scala.inline
    def setSuccessorsVarargs(value: ISuccessor*): Self = StObject.set(x, "successors", js.Array(value :_*))
  }
}
