package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDimmerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalDimmer", JSImport.Default)
  @js.native
  val default: StatelessComponent[ModalDimmerProps] = js.native
  
  @js.native
  trait ModalDimmerProps
    extends StrictModalDimmerProps
       with /* key */ StringDictionary[js.Any]
  object ModalDimmerProps {
    
    @scala.inline
    def apply(): ModalDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDimmerProps]
    }
  }
  
  @js.native
  trait StrictModalDimmerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A dimmer can be blurred. */
    var blurring: js.UndefOr[Boolean] = js.native
    
    /** A dimmer can center its contents in the viewport. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A dimmer can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** The node where the modal should mount. Defaults to document.body. */
    var mountNode: js.UndefOr[js.Any] = js.native
    
    /** A dimmer can make body scrollable. */
    var scrolling: js.UndefOr[Boolean] = js.native
  }
  object StrictModalDimmerProps {
    
    @scala.inline
    def apply(): StrictModalDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalDimmerProps]
    }
    
    @scala.inline
    implicit class StrictModalDimmerPropsMutableBuilder[Self <: StrictModalDimmerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBlurring(value: Boolean): Self = StObject.set(x, "blurring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurringUndefined: Self = StObject.set(x, "blurring", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
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
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setMountNode(value: js.Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ModalDimmerProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalDimmerMod.foo` */
  override def _to: StatelessComponent[ModalDimmerProps] = default
}
