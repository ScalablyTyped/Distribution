package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsViewsItemItemMod.ItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsItemItemGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemGroup", JSImport.Default)
  @js.native
  val default: FC[ItemGroupProps] = js.native
  
  trait ItemGroupProps
    extends StObject
       with StrictItemGroupProps
       with /* key */ StringDictionary[Any]
  object ItemGroupProps {
    
    inline def apply(): ItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemGroupProps]
    }
  }
  
  trait StrictItemGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Items can be divided to better distinguish between grouped content. */
    var divided: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for Item. */
    var items: js.UndefOr[SemanticShorthandCollection[ItemProps]] = js.undefined
    
    /** An item can be formatted so that the entire contents link to another page. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /** A group of items can relax its padding to provide more negative space. */
    var relaxed: js.UndefOr[Boolean | "very"] = js.undefined
    
    /** Prevent items from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.undefined
  }
  object StrictItemGroupProps {
    
    inline def apply(): StrictItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemGroupProps]
    }
    
    extension [Self <: StrictItemGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      inline def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[ItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[ItemProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setRelaxed(value: Boolean | "very"): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      inline def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      inline def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
    }
  }
  
  type _To = FC[ItemGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsItemItemGroupMod.foo` */
  override def _to: FC[ItemGroupProps] = default
}
