package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.listContentMod.ListContentProps
import typings.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typings.semanticUiReact.listHeaderMod.ListHeaderProps
import typings.semanticUiReact.listIconMod.ListIconProps
import typings.semanticUiReact.listItemMod.ListItemProps
import typings.semanticUiReact.listListListMod.ListListProps
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/List", JSImport.Default)
  @js.native
  val default: ListComponent = js.native
  
  @js.native
  trait ListComponent
    extends StObject
       with FunctionComponent[ListProps] {
    
    var Content: StatelessComponent[ListContentProps] = js.native
    
    var Description: StatelessComponent[ListDescriptionProps] = js.native
    
    var Header: StatelessComponent[ListHeaderProps] = js.native
    
    var Icon: StatelessComponent[ListIconProps] = js.native
    
    var Item: StatelessComponent[ListItemProps] = js.native
    
    var List: StatelessComponent[ListListProps] = js.native
  }
  
  trait ListProps
    extends StObject
       with StrictListProps
       with /* key */ StringDictionary[js.Any]
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
  }
  
  trait StrictListProps extends StObject {
    
    /** A list can animate to set the current item apart from the list. */
    var animated: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A list can mark items with a bullet. */
    var bulleted: js.UndefOr[Boolean] = js.undefined
    
    /** A list can divide its items into cells. */
    var celled: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A list can show divisions between content. */
    var divided: js.UndefOr[Boolean] = js.undefined
    
    /** An list can be floated left or right. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** A list can be formatted to have items appear horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** A list can be inverted to appear on a dark background. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for ListItem. */
    var items: js.UndefOr[SemanticShorthandCollection[ListItemProps]] = js.undefined
    
    /** A list can be specially formatted for navigation links. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /**
      * onClick handler for ListItem. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onItemClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ ListItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A list can be ordered numerically. */
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    /** A list can relax its padding to provide more negative space. */
    var relaxed: js.UndefOr[Boolean | very] = js.undefined
    
    /** A selection list formats list items as possible choices. */
    var selection: js.UndefOr[Boolean] = js.undefined
    
    /** A list can vary in size. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictListProps {
    
    @scala.inline
    def apply(): StrictListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListProps]
    }
    
    @scala.inline
    implicit class StrictListPropsMutableBuilder[Self <: StrictListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBulleted(value: Boolean): Self = StObject.set(x, "bulleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletedUndefined: Self = StObject.set(x, "bulleted", js.undefined)
      
      @scala.inline
      def setCelled(value: Boolean): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
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
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[ListItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[ListItemProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnItemClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ ListItemProps) => Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      @scala.inline
      def setRelaxed(value: Boolean | very): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      @scala.inline
      def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ListComponent
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: ListComponent = default
}
