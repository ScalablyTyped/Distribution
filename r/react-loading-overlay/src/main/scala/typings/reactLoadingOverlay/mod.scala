package typings.reactLoadingOverlay

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactLoadingOverlay.anon.Content
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-loading-overlay", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LoadingOverlayProps, js.Object, Any]
  
  type LoadingOverlay = Component[LoadingOverlayProps, js.Object, Any]
  
  trait LoadingOverlayProps extends StObject {
    
    /** default: ``true`` - whether the loader is visible. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default: ``undefined`` - the className for the wrapping ``<div />`` that
      *  is present whether active or not.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * default: ``_loading_overlay_`` - the prefix for all classNames on the
      * generated elements. see Styling for more info.
      */
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    /** default: ``500`` - the transition speed for fading out the overlay. */
    var fadeSpeed: js.UndefOr[Double] = js.undefined
    
    /** default: ``undefined`` - click handler for the overlay when active. */
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * default: ``false`` - renders the default spinner when true (and when the
      * loader is active). Otherwise you can provide any valid react node to use
      * your own spinner.
      */
    var spinner: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    /**
      * default: ``undefined`` - see Styling for more info.
      */
    var styles: js.UndefOr[Content] = js.undefined
    
    /**
      * default: ``undefined`` - the text or react node to render in the loader overlay when active.
      */
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object LoadingOverlayProps {
    
    inline def apply(): LoadingOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadingOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      inline def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSpinner(value: Boolean | ReactNode): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
