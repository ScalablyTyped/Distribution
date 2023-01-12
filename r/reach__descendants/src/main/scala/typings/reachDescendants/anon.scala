package typings.reachDescendants

import typings.reachDescendants.mod.Descendant
import typings.reachDescendants.mod.DescendantContextValue
import typings.reachDescendants.reachDescendantsStrings.both
import typings.reachDescendants.reachDescendantsStrings.horizontal
import typings.reachDescendants.reachDescendantsStrings.option
import typings.reachDescendants.reachDescendantsStrings.vertical
import typings.react.mod.Context
import typings.react.mod.Dispatch
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Callback[K /* <: /* keyof DescendantType */ String */, DescendantType /* <: Descendant[HTMLElement] */] extends StObject {
    
    def callback(nextOption: DescendantType): Unit = js.native
    def callback(
      nextOption: /* import warning: importer.ImportType#apply Failed type conversion: DescendantType[K] */ js.Any
    ): Unit = js.native
    
    var currentIndex: js.UndefOr[Double | Null] = js.native
    
    var filter: js.UndefOr[js.Function1[/* descendant */ DescendantType, Boolean]] = js.native
    
    var key: js.UndefOr[K | option] = js.native
    
    var orientation: js.UndefOr[vertical | horizontal | both] = js.native
    
    var rotate: js.UndefOr[Boolean] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
  }
  
  trait Children[DescendantType /* <: Descendant[HTMLElement] */] extends StObject {
    
    var children: ReactNode
    
    var context: Context[DescendantContextValue[DescendantType]]
    
    var items: js.Array[DescendantType]
    
    var set: Dispatch[SetStateAction[js.Array[DescendantType]]]
  }
  object Children {
    
    inline def apply[DescendantType /* <: Descendant[HTMLElement] */](
      context: Context[DescendantContextValue[DescendantType]],
      items: js.Array[DescendantType],
      set: SetStateAction[js.Array[DescendantType]] => Unit
    ): Children[DescendantType] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Children[DescendantType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?], DescendantType /* <: Descendant[HTMLElement] */] (val x: Self & Children[DescendantType]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: Context[DescendantContextValue[DescendantType]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DescendantType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DescendantType*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSet(value: SetStateAction[js.Array[DescendantType]] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
