package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[ModalContentProps] = js.native
  
  trait ModalContentProps
    extends StObject
       with StrictModalContentProps
       with /* key */ StringDictionary[js.Any]
  object ModalContentProps {
    
    @scala.inline
    def apply(): ModalContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalContentProps]
    }
  }
  
  trait StrictModalContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A modal can contain image content. */
    var image: js.UndefOr[Boolean] = js.undefined
    
    /** A modal can use the entire size of the screen. */
    var scrolling: js.UndefOr[Boolean] = js.undefined
  }
  object StrictModalContentProps {
    
    @scala.inline
    def apply(): StrictModalContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalContentProps]
    }
    
    @scala.inline
    implicit class StrictModalContentPropsMutableBuilder[Self <: StrictModalContentProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ModalContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalContentMod.foo` */
  override def _to: StatelessComponent[ModalContentProps] = default
}
