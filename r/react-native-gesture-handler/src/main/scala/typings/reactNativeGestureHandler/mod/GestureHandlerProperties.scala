package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerProperties extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
  
  var waitFor: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
}
object GestureHandlerProperties {
  
  inline def apply(): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlerProperties]
  }
  
  extension [Self <: GestureHandlerProperties](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setSimultaneousHandlers(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
    
    inline def setWaitFor(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
