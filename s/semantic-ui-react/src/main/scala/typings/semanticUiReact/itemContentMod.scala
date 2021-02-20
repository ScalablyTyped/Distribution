package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typings.semanticUiReact.itemExtraMod.ItemExtraProps
import typings.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typings.semanticUiReact.itemMetaMod.ItemMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemContentMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemContent", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ItemContentProps, ComponentState, js.Any] {
    def this(props: ItemContentProps) = this()
    def this(props: ItemContentProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemContent", JSImport.Default)
  @js.native
  val default: ComponentClass[ItemContentProps, ComponentState] = js.native
  
  @js.native
  trait ItemContentProps
    extends StrictItemContentProps
       with /* key */ StringDictionary[js.Any]
  object ItemContentProps {
    
    @scala.inline
    def apply(): ItemContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemContentProps]
    }
  }
  
  @js.native
  trait StrictItemContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for ItemDescription component. */
    var description: js.UndefOr[SemanticShorthandItem[ItemDescriptionProps]] = js.native
    
    /** Shorthand for ItemExtra component. */
    var extra: js.UndefOr[SemanticShorthandItem[ItemExtraProps]] = js.native
    
    /** Shorthand for ItemHeader component. */
    var header: js.UndefOr[SemanticShorthandItem[ItemHeaderProps]] = js.native
    
    /** Shorthand for ItemMeta component. */
    var meta: js.UndefOr[SemanticShorthandItem[ItemMetaProps]] = js.native
    
    /** Content can specify its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  }
  object StrictItemContentProps {
    
    @scala.inline
    def apply(): StrictItemContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemContentProps]
    }
    
    @scala.inline
    implicit class StrictItemContentPropsMutableBuilder[Self <: StrictItemContentProps] (val x: Self) extends AnyVal {
      
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
      def setDescription(value: SemanticShorthandItem[ItemDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ElementType[ItemDescriptionProps], ItemDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtra(value: SemanticShorthandItem[ItemExtraProps]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFunction3(
        value: (/* component */ ElementType[ItemExtraProps], ItemExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extra", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[ItemHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ElementType[ItemHeaderProps], ItemHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setMeta(value: SemanticShorthandItem[ItemMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* component */ ElementType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ComponentClass[ItemContentProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `itemContentMod.foo` */
  override def _to: ComponentClass[ItemContentProps, ComponentState] = default
}
