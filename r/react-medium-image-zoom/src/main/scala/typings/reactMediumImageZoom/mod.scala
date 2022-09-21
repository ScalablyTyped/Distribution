package typings.reactMediumImageZoom

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-medium-image-zoom", JSImport.Default)
  @js.native
  open class default () extends Component[ImageZoomProps, Any, Any]
  
  type ImageZoom = Component[ImageZoomProps, Any, Any]
  
  trait ImageZoomDefaultStyles extends StObject {
    
    var image: js.UndefOr[js.Object] = js.undefined
    
    var overlay: js.UndefOr[js.Object] = js.undefined
    
    var zoomContainer: js.UndefOr[js.Object] = js.undefined
    
    var zoomImage: js.UndefOr[js.Object] = js.undefined
  }
  object ImageZoomDefaultStyles {
    
    inline def apply(): ImageZoomDefaultStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageZoomDefaultStyles]
    }
    
    extension [Self <: ImageZoomDefaultStyles](x: Self) {
      
      inline def setImage(value: js.Object): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOverlay(value: js.Object): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setZoomContainer(value: js.Object): Self = StObject.set(x, "zoomContainer", value.asInstanceOf[js.Any])
      
      inline def setZoomContainerUndefined: Self = StObject.set(x, "zoomContainer", js.undefined)
      
      inline def setZoomImage(value: js.Object): Self = StObject.set(x, "zoomImage", value.asInstanceOf[js.Any])
      
      inline def setZoomImageUndefined: Self = StObject.set(x, "zoomImage", js.undefined)
    }
  }
  
  trait ImageZoomImage extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ImageZoomImage {
    
    inline def apply(src: String): ImageZoomImage = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageZoomImage]
    }
    
    extension [Self <: ImageZoomImage](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ImageZoomProps extends StObject {
    
    var defaultStyles: js.UndefOr[ImageZoomDefaultStyles] = js.undefined
    
    var image: ImageZoomImage
    
    var isZoomed: js.UndefOr[Boolean] = js.undefined
    
    var onUnzoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var onZoom: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var shouldHandleZoom: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var shouldReplaceImage: js.UndefOr[Boolean] = js.undefined
    
    var shouldRespectMaxDimension: js.UndefOr[Boolean] = js.undefined
    
    var zoomImage: js.UndefOr[ImageZoomZoomImage] = js.undefined
    
    var zoomMargin: js.UndefOr[Double] = js.undefined
  }
  object ImageZoomProps {
    
    inline def apply(image: ImageZoomImage): ImageZoomProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageZoomProps]
    }
    
    extension [Self <: ImageZoomProps](x: Self) {
      
      inline def setDefaultStyles(value: ImageZoomDefaultStyles): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
      
      inline def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
      
      inline def setImage(value: ImageZoomImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setIsZoomed(value: Boolean): Self = StObject.set(x, "isZoomed", value.asInstanceOf[js.Any])
      
      inline def setIsZoomedUndefined: Self = StObject.set(x, "isZoomed", js.undefined)
      
      inline def setOnUnzoom(value: () => js.Object): Self = StObject.set(x, "onUnzoom", js.Any.fromFunction0(value))
      
      inline def setOnUnzoomUndefined: Self = StObject.set(x, "onUnzoom", js.undefined)
      
      inline def setOnZoom(value: () => js.Object): Self = StObject.set(x, "onZoom", js.Any.fromFunction0(value))
      
      inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      inline def setShouldHandleZoom(value: () => Boolean): Self = StObject.set(x, "shouldHandleZoom", js.Any.fromFunction0(value))
      
      inline def setShouldHandleZoomUndefined: Self = StObject.set(x, "shouldHandleZoom", js.undefined)
      
      inline def setShouldReplaceImage(value: Boolean): Self = StObject.set(x, "shouldReplaceImage", value.asInstanceOf[js.Any])
      
      inline def setShouldReplaceImageUndefined: Self = StObject.set(x, "shouldReplaceImage", js.undefined)
      
      inline def setShouldRespectMaxDimension(value: Boolean): Self = StObject.set(x, "shouldRespectMaxDimension", value.asInstanceOf[js.Any])
      
      inline def setShouldRespectMaxDimensionUndefined: Self = StObject.set(x, "shouldRespectMaxDimension", js.undefined)
      
      inline def setZoomImage(value: ImageZoomZoomImage): Self = StObject.set(x, "zoomImage", value.asInstanceOf[js.Any])
      
      inline def setZoomImageUndefined: Self = StObject.set(x, "zoomImage", js.undefined)
      
      inline def setZoomMargin(value: Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
      
      inline def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
    }
  }
  
  trait ImageZoomZoomImage extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ImageZoomZoomImage {
    
    inline def apply(): ImageZoomZoomImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageZoomZoomImage]
    }
    
    extension [Self <: ImageZoomZoomImage](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
