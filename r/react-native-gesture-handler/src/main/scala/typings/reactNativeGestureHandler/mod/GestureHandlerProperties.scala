package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureHandlerProperties extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}
object GestureHandlerProperties {
  
  @scala.inline
  def apply(): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlerProperties]
  }
  
  @scala.inline
  implicit class GestureHandlerPropertiesMutableBuilder[Self <: GestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    @scala.inline
    def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def setWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
  }
}
