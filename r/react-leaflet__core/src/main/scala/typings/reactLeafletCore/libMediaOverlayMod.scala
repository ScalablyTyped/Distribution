package typings.reactLeafletCore

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.SVGOverlay_
import typings.leaflet.mod.VideoOverlay_
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaOverlayMod {
  
  @JSImport("@react-leaflet/core/lib/media-overlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: ImageOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: SVGOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateMediaOverlay[P /* <: MediaOverlayProps */](overlay: VideoOverlay_, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMediaOverlay")(overlay.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.leaflet.mod.InteractiveLayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined 
  - typings.reactLeafletCore.libLayerMod.InteractiveLayerProps because var conflicts: attribution, bubblingMouseEvents, interactive, pane. Inlined  */ trait MediaOverlayProps
    extends StObject
       with ImageOverlayOptions
       with EventedProps {
    
    var bounds: LatLngBoundsExpression
  }
  object MediaOverlayProps {
    
    inline def apply(bounds: LatLngBoundsExpression): MediaOverlayProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    }
  }
}
