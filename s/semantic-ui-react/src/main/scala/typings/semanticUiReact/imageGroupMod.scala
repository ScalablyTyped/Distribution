package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Image/ImageGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[ImageGroupProps] = js.native
  
  trait ImageGroupProps
    extends StObject
       with StrictImageGroupProps
       with /* key */ StringDictionary[js.Any]
  object ImageGroupProps {
    
    @scala.inline
    def apply(): ImageGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageGroupProps]
    }
  }
  
  trait StrictImageGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A group of images can be formatted to have the same size. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
  }
  object StrictImageGroupProps {
    
    @scala.inline
    def apply(): StrictImageGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictImageGroupProps]
    }
    
    @scala.inline
    implicit class StrictImageGroupPropsMutableBuilder[Self <: StrictImageGroupProps] (val x: Self) extends AnyVal {
      
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
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ImageGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageGroupMod.foo` */
  override def _to: StatelessComponent[ImageGroupProps] = default
}
