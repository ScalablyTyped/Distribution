package typings.reactNativeDraggableFlatlist

import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.Index
import typings.reactNativeDraggableFlatlist.libTypescriptTypesMod.RenderPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPlaceholderItemMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/components/PlaceholderItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof PlaceholderItem` */
  inline def default[T](param0: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T] extends StObject {
    
    var renderPlaceholder: js.UndefOr[RenderPlaceholder[T]] = js.undefined
  }
  object Props {
    
    inline def apply[T](): Props[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setRenderPlaceholder(value: /* params */ Index[T] => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
      
      inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    }
  }
}
