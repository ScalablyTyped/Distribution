package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveBack extends StObject {
  
  var moveBack: js.UndefOr[String] = js.undefined
  
  var moveForward: js.UndefOr[String] = js.undefined
  
  var moveToday: js.UndefOr[String] = js.undefined
}
object MoveBack {
  
  inline def apply(): MoveBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveBack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveBack] (val x: Self) extends AnyVal {
    
    inline def setMoveBack(value: String): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
    
    inline def setMoveBackUndefined: Self = StObject.set(x, "moveBack", js.undefined)
    
    inline def setMoveForward(value: String): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
    
    inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    inline def setMoveToday(value: String): Self = StObject.set(x, "moveToday", value.asInstanceOf[js.Any])
    
    inline def setMoveTodayUndefined: Self = StObject.set(x, "moveToday", js.undefined)
  }
}
