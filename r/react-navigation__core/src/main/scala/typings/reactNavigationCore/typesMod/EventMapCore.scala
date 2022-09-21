package typings.reactNavigationCore.typesMod

import typings.reactNavigationCore.anon.CanPreventDefaultData
import typings.reactNavigationCore.anon.DataStateState
import typings.reactNavigationCore.anon.DataUndefined
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMapCore[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var beforeRemove: CanPreventDefaultData
  
  var blur: DataUndefined
  
  var focus: DataUndefined
  
  var state: DataStateState[State]
}
object EventMapCore {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](
    beforeRemove: CanPreventDefaultData,
    blur: DataUndefined,
    focus: DataUndefined,
    state: DataStateState[State]
  ): EventMapCore[State] = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMapCore[State]]
  }
  
  extension [Self <: EventMapCore[?], State /* <: NavigationState[ParamListBase] */](x: Self & EventMapCore[State]) {
    
    inline def setBeforeRemove(value: CanPreventDefaultData): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: DataUndefined): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: DataUndefined): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setState(value: DataStateState[State]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
