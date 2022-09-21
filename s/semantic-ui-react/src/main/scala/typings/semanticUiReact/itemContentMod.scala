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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemContentMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemContent", JSImport.Default)
  @js.native
  open class default protected () extends Component[ItemContentProps, ComponentState, Any] {
    def this(props: ItemContentProps) = this()
    def this(props: ItemContentProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemContent", JSImport.Default)
  @js.native
  val default: ComponentClass[ItemContentProps, ComponentState] = js.native
  
  trait ItemContentProps
    extends StObject
       with StrictItemContentProps
       with /* key */ StringDictionary[Any]
  object ItemContentProps {
    
    inline def apply(): ItemContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemContentProps]
    }
  }
  
  trait StrictItemContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for ItemDescription component. */
    var description: js.UndefOr[SemanticShorthandItem[ItemDescriptionProps]] = js.undefined
    
    /** Shorthand for ItemExtra component. */
    var extra: js.UndefOr[SemanticShorthandItem[ItemExtraProps]] = js.undefined
    
    /** Shorthand for ItemHeader component. */
    var header: js.UndefOr[SemanticShorthandItem[ItemHeaderProps]] = js.undefined
    
    /** Shorthand for ItemMeta component. */
    var meta: js.UndefOr[SemanticShorthandItem[ItemMetaProps]] = js.undefined
    
    /** Content can specify its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictItemContentProps {
    
    inline def apply(): StrictItemContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictItemContentProps]
    }
    
    extension [Self <: StrictItemContentProps](x: Self) {
      
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
      
      inline def setMeta(value: SemanticShorthandItem[ItemMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType[ItemMetaProps], ItemMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ComponentClass[ItemContentProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `itemContentMod.foo` */
  override def _to: ComponentClass[ItemContentProps, ComponentState] = default
}
