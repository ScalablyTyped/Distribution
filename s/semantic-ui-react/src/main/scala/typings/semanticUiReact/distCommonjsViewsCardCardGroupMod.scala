package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticUiReact.distCommonjsViewsCardCardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCardCardGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardGroup", JSImport.Default)
  @js.native
  val default: FC[CardGroupProps] = js.native
  
  trait CardGroupProps
    extends StObject
       with StrictCardGroupProps
       with /* key */ StringDictionary[Any]
  object CardGroupProps {
    
    inline def apply(): CardGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGroupProps]
    }
  }
  
  trait StrictCardGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A group of cards can center itself inside its container. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A group of cards can double its column width for mobile. */
    var doubling: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for Card. */
    var items: js.UndefOr[SemanticShorthandCollection[CardProps]] = js.undefined
    
    /** A group of cards can set how many cards should exist in a row. */
    var itemsPerRow: js.UndefOr[SemanticWIDTHS] = js.undefined
    
    /** A group of cards can automatically stack rows to a single columns on mobile devices. */
    var stackable: js.UndefOr[Boolean] = js.undefined
    
    /** A card group can adjust its text alignment. */
    var textAlign: js.UndefOr["center" | "left" | "right"] = js.undefined
  }
  object StrictCardGroupProps {
    
    inline def apply(): StrictCardGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardGroupProps]
    }
    
    extension [Self <: StrictCardGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDoubling(value: Boolean): Self = StObject.set(x, "doubling", value.asInstanceOf[js.Any])
      
      inline def setDoublingUndefined: Self = StObject.set(x, "doubling", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[CardProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsPerRow(value: SemanticWIDTHS): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
      
      inline def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[CardProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      inline def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      inline def setTextAlign(value: "center" | "left" | "right"): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = FC[CardGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsCardCardGroupMod.foo` */
  override def _to: FC[CardGroupProps] = default
}
