package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typings.semanticUiReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsListListContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListContent", JSImport.Default)
  @js.native
  val default: FC[ListContentProps] = js.native
  
  trait ListContentProps
    extends StObject
       with StrictListContentProps
       with /* key */ StringDictionary[Any]
  object ListContentProps {
    
    inline def apply(): ListContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContentProps]
    }
  }
  
  trait StrictListContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for ListDescription. */
    var description: js.UndefOr[SemanticShorthandItem[ListDescriptionProps]] = js.undefined
    
    /** An list content can be floated left or right. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** Shorthand for ListHeader. */
    var header: js.UndefOr[SemanticShorthandItem[ListHeaderProps]] = js.undefined
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictListContentProps {
    
    inline def apply(): StrictListContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictListContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: SemanticShorthandItem[ListDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType[ListDescriptionProps], ListDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[ListHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[ListHeaderProps], ListHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = FC[ListContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsListListContentMod.foo` */
  override def _to: FC[ListContentProps] = default
}
