package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDimmerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Modal/ModalDimmer", JSImport.Default)
  @js.native
  val default: StatelessComponent[ModalDimmerProps] = js.native
  
  trait ModalDimmerProps
    extends StObject
       with StrictModalDimmerProps
       with /* key */ StringDictionary[js.Any]
  object ModalDimmerProps {
    
    inline def apply(): ModalDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalDimmerProps]
    }
  }
  
  trait StrictModalDimmerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A dimmer can be blurred. */
    var blurring: js.UndefOr[Boolean] = js.undefined
    
    /** A dimmer can center its contents in the viewport. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A dimmer can be inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** The node where the modal should mount. Defaults to document.body. */
    var mountNode: js.UndefOr[js.Any] = js.undefined
    
    /** A dimmer can make body scrollable. */
    var scrolling: js.UndefOr[Boolean] = js.undefined
  }
  object StrictModalDimmerProps {
    
    inline def apply(): StrictModalDimmerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictModalDimmerProps]
    }
    
    extension [Self <: StrictModalDimmerProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBlurring(value: Boolean): Self = StObject.set(x, "blurring", value.asInstanceOf[js.Any])
      
      inline def setBlurringUndefined: Self = StObject.set(x, "blurring", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setMountNode(value: js.Any): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ModalDimmerProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalDimmerMod.foo` */
  override def _to: StatelessComponent[ModalDimmerProps] = default
}
