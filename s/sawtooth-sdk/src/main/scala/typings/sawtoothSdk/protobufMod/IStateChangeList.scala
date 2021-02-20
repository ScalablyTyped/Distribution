package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateChangeList extends StObject {
  
  /** StateChangeList stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.native
}
object IStateChangeList {
  
  @scala.inline
  def apply(): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChangeList]
  }
  
  @scala.inline
  implicit class IStateChangeListMutableBuilder[Self <: IStateChangeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateChanges(value: js.Array[IStateChange]): Self = StObject.set(x, "stateChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangesNull: Self = StObject.set(x, "stateChanges", null)
    
    @scala.inline
    def setStateChangesUndefined: Self = StObject.set(x, "stateChanges", js.undefined)
    
    @scala.inline
    def setStateChangesVarargs(value: IStateChange*): Self = StObject.set(x, "stateChanges", js.Array(value :_*))
  }
}
