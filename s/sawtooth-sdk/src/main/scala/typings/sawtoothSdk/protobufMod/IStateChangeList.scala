package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateChangeList extends StObject {
  
  /** StateChangeList stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.undefined
}
object IStateChangeList {
  
  inline def apply(): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChangeList]
  }
  
  extension [Self <: IStateChangeList](x: Self) {
    
    inline def setStateChanges(value: js.Array[IStateChange]): Self = StObject.set(x, "stateChanges", value.asInstanceOf[js.Any])
    
    inline def setStateChangesNull: Self = StObject.set(x, "stateChanges", null)
    
    inline def setStateChangesUndefined: Self = StObject.set(x, "stateChanges", js.undefined)
    
    inline def setStateChangesVarargs(value: IStateChange*): Self = StObject.set(x, "stateChanges", js.Array(value :_*))
  }
}
