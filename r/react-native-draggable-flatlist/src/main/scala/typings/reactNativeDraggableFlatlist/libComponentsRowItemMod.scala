package typings.reactNativeDraggableFlatlist

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItem
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItemParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRowItemMod {
  
  @JSImport("react-native-draggable-flatlist/lib/components/RowItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof RowItem` */
  inline def default[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T] extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    def drag(itemKey: String): Unit
    
    var extraData: js.UndefOr[Any] = js.undefined
    
    var item: T
    
    var itemKey: String
    
    var renderItem: RenderItem[T]
  }
  object Props {
    
    inline def apply[T](
      drag: String => Unit,
      item: T,
      itemKey: String,
      renderItem: /* params */ RenderItemParams[T] => ReactNode
    ): Props[T] = {
      val __obj = js.Dynamic.literal(drag = js.Any.fromFunction1(drag), item = item.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDrag(value: String => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setRenderItem(value: /* params */ RenderItemParams[T] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    }
  }
}
