package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[T] extends StObject {
  
  var ref: typings.react.mod.Ref[FlatList[T]]
  
  var simultaneousHandlers: js.UndefOr[typings.react.mod.Ref[Any] | js.Array[typings.react.mod.Ref[Any]]] = js.undefined
}
object Ref {
  
  inline def apply[T](): Ref[T] = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[Ref[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref[?], T] (val x: Self & Ref[T]) extends AnyVal {
    
    inline def setRef(value: typings.react.mod.Ref[FlatList[T]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FlatList[T] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setSimultaneousHandlers(value: typings.react.mod.Ref[Any] | js.Array[typings.react.mod.Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: typings.react.mod.Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
  }
}
