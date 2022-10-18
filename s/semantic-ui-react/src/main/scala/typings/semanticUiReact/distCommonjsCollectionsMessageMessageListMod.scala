package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMessageMessageListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageList", JSImport.Default)
  @js.native
  val default: FC[MessageListProps] = js.native
  
  trait MessageListProps
    extends StObject
       with StrictMessageListProps
       with /* key */ StringDictionary[Any]
  object MessageListProps {
    
    inline def apply(): MessageListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListProps]
    }
  }
  
  trait StrictMessageListProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand Message.Items. */
    var items: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
  }
  object StrictMessageListProps {
    
    inline def apply(): StrictMessageListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageListProps]
    }
    
    extension [Self <: StrictMessageListProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  type _To = FC[MessageListProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMessageMessageListMod.foo` */
  override def _to: FC[MessageListProps] = default
}
