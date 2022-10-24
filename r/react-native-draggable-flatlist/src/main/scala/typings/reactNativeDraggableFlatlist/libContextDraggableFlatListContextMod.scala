package typings.reactNativeDraggableFlatlist

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextDraggableFlatListContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/draggableFlatListContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](param0: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDraggableFlatListContext[T](): DraggableFlatListContextValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDraggableFlatListContext")().asInstanceOf[DraggableFlatListContextValue[T]]
  
  /* Inlined std.Omit<react-native-draggable-flatlist.react-native-draggable-flatlist/lib/context/draggableFlatListContext.Props<T>, 'children'> */
  trait DraggableFlatListContextValue[T] extends StObject {
    
    var activeKey: js.UndefOr[String | Null] = js.undefined
    
    var horizontal: Boolean
    
    var keyExtractor: js.Function2[/* item */ T, /* index */ Double, String]
    
    var onDragEnd: js.Function1[/* param0 */ js.Array[Double], Unit]
  }
  object DraggableFlatListContextValue {
    
    inline def apply[T](
      horizontal: Boolean,
      keyExtractor: (/* item */ T, /* index */ Double) => String,
      onDragEnd: /* param0 */ js.Array[Double] => Unit
    ): DraggableFlatListContextValue[T] = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), onDragEnd = js.Any.fromFunction1(onDragEnd))
      __obj.asInstanceOf[DraggableFlatListContextValue[T]]
    }
    
    extension [Self <: DraggableFlatListContextValue[?], T](x: Self & DraggableFlatListContextValue[T]) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setOnDragEnd(value: /* param0 */ js.Array[Double] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    }
  }
  
  trait Props[T] extends StObject {
    
    var activeKey: String | Null
    
    var children: ReactNode
    
    var horizontal: Boolean
    
    def keyExtractor(item: T, index: Double): String
    
    def onDragEnd(param0: js.Array[Double]): Unit
  }
  object Props {
    
    inline def apply[T](horizontal: Boolean, keyExtractor: (T, Double) => String, onDragEnd: js.Array[Double] => Unit): Props[T] = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), onDragEnd = js.Any.fromFunction1(onDragEnd), activeKey = null)
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setKeyExtractor(value: (T, Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setOnDragEnd(value: js.Array[Double] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    }
  }
}
