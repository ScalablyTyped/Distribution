package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typings.semanticUiReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typings.semanticUiReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typings.semanticUiReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import typings.semanticUiReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typings.semanticUiReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typings.semanticUiReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsItemItemMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Item/Item", JSImport.Default)
    @js.native
    val ^ : ItemComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Item/Item", "default.Content")
    @js.native
    open class Content protected () extends Component[ItemContentProps, ComponentState, Any] {
      def this(props: ItemContentProps) = this()
      def this(props: ItemContentProps, context: Any) = this()
    }
    
    type _To = ItemComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ItemComponent = ^
  }
  
  @js.native
  trait ItemComponent
    extends StObject
       with FunctionComponent[ItemProps] {
    
    var Content: ComponentClass[ItemContentProps, ComponentState] = js.native
    
    var Description: FC[ItemDescriptionProps] = js.native
    
    var Extra: FC[ItemExtraProps] = js.native
    
    var Group: FC[ItemGroupProps] = js.native
    
    var Header: FC[ItemHeaderProps] = js.native
    
    var Image: FC[ItemImageProps] = js.native
    
    var Meta: FC[ItemMetaProps] = js.native
  }
  
  trait ItemProps
    extends StObject
       with StrictItemProps
       with /* key */ StringDictionary[Any]
  object ItemProps {
    
    inline def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
  }
  
  trait StrictItemProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for ItemContent component. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for ItemDescription component. */
    var description: js.UndefOr[SemanticShorthandItem[ItemDescriptionProps]] = js.undefined
    
    /** Shorthand for ItemExtra component. */
    var extra: js.UndefOr[SemanticShorthandItem[ItemExtraProps]] = js.undefined
    
    /** Shorthand for ItemHeader component. */
    var header: js.UndefOr[SemanticShorthandItem[ItemHeaderProps]] = js.undefined
    
    /** Shorthand for ItemImage component. */
    var image: js.UndefOr[SemanticShorthandItem[ItemImageProps]] = js.undefined
    
    /** Shorthand for ItemMeta component. */
    var meta: js.UndefOr[SemanticShorthandItem[ItemMetaProps]] = js.undefined
  }
  object StrictItemProps {
    
    inline def apply(): StrictItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictItemProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: SemanticShorthandItem[ItemDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType[ItemDescriptionProps], ItemDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtra(value: SemanticShorthandItem[ItemExtraProps]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraFunction3(
        value: (/* component */ ElementType[ItemExtraProps], ItemExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extra", js.Any.fromFunction3(value))
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[ItemHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[ItemHeaderProps], ItemHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setImage(value: SemanticShorthandItem[ItemImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageFunction3(
        value: (/* component */ ElementType[ItemImageProps], ItemImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMeta(value: SemanticShorthandItem[ItemMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
