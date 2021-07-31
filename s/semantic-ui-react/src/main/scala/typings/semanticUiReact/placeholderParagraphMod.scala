package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderParagraphMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderParagraph", JSImport.Default)
  @js.native
  val default: PlaceholderParagraphComponent = js.native
  
  type PlaceholderParagraphComponent = StatelessComponent[PlaceholderParagraphProps]
  
  trait PlaceholderParagraphProps
    extends StObject
       with StrictPlaceholderParagraphProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderParagraphProps {
    
    @scala.inline
    def apply(): PlaceholderParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderParagraphProps]
    }
  }
  
  trait StrictPlaceholderParagraphProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictPlaceholderParagraphProps {
    
    @scala.inline
    def apply(): StrictPlaceholderParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderParagraphProps]
    }
    
    @scala.inline
    implicit class StrictPlaceholderParagraphPropsMutableBuilder[Self <: StrictPlaceholderParagraphProps] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  type _To = PlaceholderParagraphComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderParagraphMod.foo` */
  override def _to: PlaceholderParagraphComponent = default
}
