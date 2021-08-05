package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangeLogEntry extends StObject {
  
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.undefined
}
object IChangeLogEntry {
  
  inline def apply(): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangeLogEntry]
  }
  
  extension [Self <: IChangeLogEntry](x: Self) {
    
    inline def setAdditions(value: js.Array[Uint8Array]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsNull: Self = StObject.set(x, "additions", null)
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAdditionsVarargs(value: Uint8Array*): Self = StObject.set(x, "additions", js.Array(value :_*))
    
    inline def setParent(value: Uint8Array): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSuccessors(value: js.Array[ISuccessor]): Self = StObject.set(x, "successors", value.asInstanceOf[js.Any])
    
    inline def setSuccessorsNull: Self = StObject.set(x, "successors", null)
    
    inline def setSuccessorsUndefined: Self = StObject.set(x, "successors", js.undefined)
    
    inline def setSuccessorsVarargs(value: ISuccessor*): Self = StObject.set(x, "successors", js.Array(value :_*))
  }
}
