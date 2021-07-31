package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderHeader", JSImport.Default)
  @js.native
  val default: PlaceholderHeaderComponent = js.native
  
  type PlaceholderHeaderComponent = StatelessComponent[PlaceholderHeaderProps]
  
  trait PlaceholderHeaderProps
    extends StObject
       with StrictPlaceholderHeaderProps
       with /* key */ StringDictionary[js.Any]
  object PlaceholderHeaderProps {
    
    @scala.inline
    def apply(): PlaceholderHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderHeaderProps]
    }
  }
  
  trait StrictPlaceholderHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A placeholder can contain an image. */
    var image: js.UndefOr[Boolean] = js.undefined
  }
  object StrictPlaceholderHeaderProps {
    
    @scala.inline
    def apply(): StrictPlaceholderHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderHeaderProps]
    }
    
    @scala.inline
    implicit class StrictPlaceholderHeaderPropsMutableBuilder[Self <: StrictPlaceholderHeaderProps] (val x: Self) extends AnyVal {
      
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
      def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  type _To = PlaceholderHeaderComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderHeaderMod.foo` */
  override def _to: PlaceholderHeaderComponent = default
}
