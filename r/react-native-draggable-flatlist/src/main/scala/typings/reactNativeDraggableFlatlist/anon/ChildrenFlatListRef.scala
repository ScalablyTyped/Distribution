package typings.reactNativeDraggableFlatlist.anon

import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.reactNativeGestureHandler.gestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenFlatListRef[T] extends StObject {
  
  var children: ReactNode
  
  var flatListRef: js.UndefOr[ForwardedRef[FlatList[T]] | Null] = js.undefined
}
object ChildrenFlatListRef {
  
  inline def apply[T](): ChildrenFlatListRef[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenFlatListRef[T]]
  }
  
  extension [Self <: ChildrenFlatListRef[?], T](x: Self & ChildrenFlatListRef[T]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFlatListRef(value: ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatListRef", value.asInstanceOf[js.Any])
    
    inline def setFlatListRefFunction1(value: /* instance */ FlatList[T] | Null => Unit): Self = StObject.set(x, "flatListRef", js.Any.fromFunction1(value))
    
    inline def setFlatListRefNull: Self = StObject.set(x, "flatListRef", null)
    
    inline def setFlatListRefUndefined: Self = StObject.set(x, "flatListRef", js.undefined)
  }
}
