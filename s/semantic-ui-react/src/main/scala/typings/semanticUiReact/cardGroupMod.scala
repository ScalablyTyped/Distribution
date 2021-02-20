package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.cardCardMod.CardProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[CardGroupProps] = js.native
  
  @js.native
  trait CardGroupProps
    extends StrictCardGroupProps
       with /* key */ StringDictionary[js.Any]
  object CardGroupProps {
    
    @scala.inline
    def apply(): CardGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGroupProps]
    }
  }
  
  @js.native
  trait StrictCardGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A group of cards can center itself inside its container. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A group of cards can double its column width for mobile. */
    var doubling: js.UndefOr[Boolean] = js.native
    
    /** Shorthand array of props for Card. */
    var items: js.UndefOr[SemanticShorthandCollection[CardProps]] = js.native
    
    /** A group of cards can set how many cards should exist in a row. */
    var itemsPerRow: js.UndefOr[SemanticWIDTHS] = js.native
    
    /** A group of cards can automatically stack rows to a single columns on mobile devices. */
    var stackable: js.UndefOr[Boolean] = js.native
    
    /** A card group can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.native
  }
  object StrictCardGroupProps {
    
    @scala.inline
    def apply(): StrictCardGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardGroupProps]
    }
    
    @scala.inline
    implicit class StrictCardGroupPropsMutableBuilder[Self <: StrictCardGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
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
      def setDoubling(value: Boolean): Self = StObject.set(x, "doubling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoublingUndefined: Self = StObject.set(x, "doubling", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[CardProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerRow(value: SemanticWIDTHS): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[CardProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setStackable(value: Boolean): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      @scala.inline
      def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = StatelessComponent[CardGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `cardGroupMod.foo` */
  override def _to: StatelessComponent[CardGroupProps] = default
}
