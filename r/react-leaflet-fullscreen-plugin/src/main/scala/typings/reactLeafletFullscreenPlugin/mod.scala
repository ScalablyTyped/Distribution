package typings.reactLeafletFullscreenPlugin

import typings.reactLeafletFullscreenPlugin.anon.EnterFullscreen
import typings.reactLeafletFullscreenPlugin.reactLeafletFullscreenPluginBooleans.`false`
import typings.reactLeafletFullscreenPlugin.reactLeafletFullscreenPluginStrings.bottomleft
import typings.reactLeafletFullscreenPlugin.reactLeafletFullscreenPluginStrings.bottomright
import typings.reactLeafletFullscreenPlugin.reactLeafletFullscreenPluginStrings.topleft
import typings.reactLeafletFullscreenPlugin.reactLeafletFullscreenPluginStrings.topright
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-fullscreen-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FullscreenProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait FullscreenProps extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var eventHandlers: js.UndefOr[EnterFullscreen] = js.undefined
    
    var forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var forceSeparateButton: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.undefined
    
    var position: js.UndefOr[topleft | topright | bottomleft | bottomright] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleCancel: js.UndefOr[String] = js.undefined
  }
  object FullscreenProps {
    
    inline def apply(): FullscreenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullscreenProps]
    }
    
    extension [Self <: FullscreenProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEventHandlers(value: EnterFullscreen): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
      
      inline def setForcePseudoFullscreen(value: Boolean): Self = StObject.set(x, "forcePseudoFullscreen", value.asInstanceOf[js.Any])
      
      inline def setForcePseudoFullscreenUndefined: Self = StObject.set(x, "forcePseudoFullscreen", js.undefined)
      
      inline def setForceSeparateButton(value: Boolean): Self = StObject.set(x, "forceSeparateButton", value.asInstanceOf[js.Any])
      
      inline def setForceSeparateButtonUndefined: Self = StObject.set(x, "forceSeparateButton", js.undefined)
      
      inline def setFullscreenElement(value: `false` | HTMLElement): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
      
      inline def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
      
      inline def setPosition(value: topleft | topright | bottomleft | bottomright): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleCancel(value: String): Self = StObject.set(x, "titleCancel", value.asInstanceOf[js.Any])
      
      inline def setTitleCancelUndefined: Self = StObject.set(x, "titleCancel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
