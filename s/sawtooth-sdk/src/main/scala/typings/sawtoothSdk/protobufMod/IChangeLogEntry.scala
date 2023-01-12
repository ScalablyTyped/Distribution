package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangeLogEntry extends StObject {
  
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.undefined
}
object IChangeLogEntry {
  
  inline def apply(): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangeLogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IChangeLogEntry] (val x: Self) extends AnyVal {
    
    inline def setAdditions(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsNull: Self = StObject.set(x, "additions", null)
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAdditionsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "additions", js.Array(value*))
    
    inline def setParent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSuccessors(value: js.Array[ISuccessor]): Self = StObject.set(x, "successors", value.asInstanceOf[js.Any])
    
    inline def setSuccessorsNull: Self = StObject.set(x, "successors", null)
    
    inline def setSuccessorsUndefined: Self = StObject.set(x, "successors", js.undefined)
    
    inline def setSuccessorsVarargs(value: ISuccessor*): Self = StObject.set(x, "successors", js.Array(value*))
  }
}
