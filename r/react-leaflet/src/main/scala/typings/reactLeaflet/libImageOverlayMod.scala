package typings.reactLeaflet

import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.LatLngBoundsExpression
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libMediaOverlayMod.MediaOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageOverlayMod {
  
  @JSImport("react-leaflet/lib/ImageOverlay", "ImageOverlay")
  @js.native
  val ImageOverlay: ForwardRefExoticComponent[ImageOverlayProps & RefAttributes[ImageOverlay_]] = js.native
  
  trait ImageOverlayProps
    extends StObject
       with MediaOverlayProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var url: String
  }
  object ImageOverlayProps {
    
    inline def apply(bounds: LatLngBoundsExpression, url: String): ImageOverlayProps = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
