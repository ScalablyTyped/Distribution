package typings.reactLeaflet

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.VideoOverlay_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libMediaOverlayMod.MediaOverlayProps
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVideoOverlayMod {
  
  @JSImport("react-leaflet/lib/VideoOverlay", "VideoOverlay")
  @js.native
  val VideoOverlay: ForwardRefExoticComponent[VideoOverlayProps & RefAttributes[VideoOverlay_]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.leaflet.mod.InteractiveLayerOptions because Already inherited
  - typings.leaflet.mod.ImageOverlayOptions because Already inherited
  - typings.leaflet.mod.VideoOverlayOptions because var conflicts: alt, attribution, bubblingMouseEvents, className, crossOrigin, errorOverlayUrl, interactive, opacity, pane, zIndex. Inlined keepAspectRatio, playsInline, loop, muted, autoplay */ trait VideoOverlayProps
    extends StObject
       with MediaOverlayProps {
    
    /** Whether the video starts playing automatically when loaded. */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the video will save aspect ratio after the projection. Relevant for supported browsers. See
      * [browser compatibility](https://developer.mozilla.org/en-US/docs/Web/CSS/object-fit)
      */
    var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the video will loop back to the beginning when played. */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the video starts on mute when loaded. */
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var play: js.UndefOr[Boolean] = js.undefined
    
    var playsInline: js.UndefOr[Boolean] = js.undefined
    
    var url: String | js.Array[String] | HTMLVideoElement
  }
  object VideoOverlayProps {
    
    inline def apply(bounds: LatLngBoundsExpression, url: String | js.Array[String] | HTMLVideoElement): VideoOverlayProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      inline def setUrl(value: String | js.Array[String] | HTMLVideoElement): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    }
  }
}
