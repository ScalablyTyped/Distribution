package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.itemItemMod.ItemProps
import typings.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[ItemGroupProps] = js.native
  
  trait ItemGroupProps
    extends StObject
       with StrictItemGroupProps
       with /* key */ StringDictionary[js.Any]
  object ItemGroupProps {
    
    @scala.inline
    def apply(): ItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemGroupProps]
    }
  }
  
  trait StrictItemGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
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
    var relaxed: js.UndefOr[Boolean | very] = js.undefined
    
    /** Prevent items from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.undefined
  }
  object StrictItemGroupProps {
    
    @scala.inline
    def apply(): StrictItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemGroupProps]
    }
    
    @scala.inline
    implicit class StrictItemGroupPropsMutableBuilder[Self <: StrictItemGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[ItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[ItemProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setRelaxed(value: Boolean | very): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ItemGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `itemGroupMod.foo` */
  override def _to: StatelessComponent[ItemGroupProps] = default
}
