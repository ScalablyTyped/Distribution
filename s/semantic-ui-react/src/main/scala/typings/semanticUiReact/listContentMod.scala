package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typings.semanticUiReact.listHeaderMod.ListHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[ListContentProps] = js.native
  
  trait ListContentProps
    extends StObject
       with StrictListContentProps
       with /* key */ StringDictionary[js.Any]
  object ListContentProps {
    
    @scala.inline
    def apply(): ListContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContentProps]
    }
  }
  
  trait StrictListContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): StrictListContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListContentProps]
    }
    
    @scala.inline
    implicit class StrictListContentPropsMutableBuilder[Self <: StrictListContentProps] (val x: Self) extends AnyVal {
      
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
      def setDescription(value: SemanticShorthandItem[ListDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ElementType[ListDescriptionProps], ListDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[ListHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ElementType[ListHeaderProps], ListHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ListContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `listContentMod.foo` */
  override def _to: StatelessComponent[ListContentProps] = default
}
