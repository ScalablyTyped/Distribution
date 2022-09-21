package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {} & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<any> */
trait EventMapCoreany extends StObject {
  
  var beforeRemove: CanPreventDefaultData
  
  var blur: DataUndefined
  
  var focus: DataUndefined
  
  var state: DataStateAny
}
object EventMapCoreany {
  
  inline def apply(
    beforeRemove: CanPreventDefaultData,
    blur: DataUndefined,
    focus: DataUndefined,
    state: DataStateAny
  ): EventMapCoreany = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMapCoreany]
  }
  
  extension [Self <: EventMapCoreany](x: Self) {
    
    inline def setBeforeRemove(value: CanPreventDefaultData): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: DataUndefined): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: DataUndefined): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setState(value: DataStateAny): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
