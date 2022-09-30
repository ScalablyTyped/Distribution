package typings.reactNativeDraggableFlatlist.anon

import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.reactNativeGestureHandler.gestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatListRef[T] extends StObject {
  
  var children: ReactNode
  
  var flatListRef: ForwardedRef[FlatList[T]]
}
object FlatListRef {
  
  inline def apply[T](): FlatListRef[T] = {
    val __obj = js.Dynamic.literal(flatListRef = null)
    __obj.asInstanceOf[FlatListRef[T]]
  }
  
  extension [Self <: FlatListRef[?], T](x: Self & FlatListRef[T]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFlatListRef(value: ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatListRef", value.asInstanceOf[js.Any])
    
    inline def setFlatListRefFunction1(value: /* instance */ FlatList[T] | Null => Unit): Self = StObject.set(x, "flatListRef", js.Any.fromFunction1(value))
    
    inline def setFlatListRefNull: Self = StObject.set(x, "flatListRef", null)
  }
}
