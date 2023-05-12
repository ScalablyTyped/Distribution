package typings.reactModalImage

import typings.react.mod.Component
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal-image", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalImageProps, js.Object, Any]
  
  @JSImport("react-modal-image", "Lightbox")
  @js.native
  open class Lightbox protected ()
    extends Component[ModalImageProps, js.Object, Any] {
    def this(props: ModalImageProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalImageProps, context: Any) = this()
  }
  
  type ModalImage = Component[ModalImageProps, js.Object, Any]
  
  trait ModalImageProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement] {
    
    /* Should the download button be hidden? */
    var hideDownload: js.UndefOr[Boolean] = js.undefined
    
    /* Should the zoom button be hidden? */
    var hideZoom: js.UndefOr[Boolean] = js.undefined
    
    /* The color to display in the background. */
    var imageBackgroundColor: js.UndefOr[String] = js.undefined
    
    /* The large image to display */
    var large: js.UndefOr[String] = js.undefined
    
    /* The medium image to display */
    var medium: js.UndefOr[String] = js.undefined
    
    /* Should the rotate button be shown? */
    var showRotate: js.UndefOr[Boolean] = js.undefined
    
    /* The small image to display */
    var small: String
    
    /* The srcset attribute for the small image */
    var smallSrcSet: js.UndefOr[String] = js.undefined
  }
  object ModalImageProps {
    
    inline def apply(small: String): ModalImageProps = {
      val __obj = js.Dynamic.literal(small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalImageProps] (val x: Self) extends AnyVal {
      
      inline def setHideDownload(value: Boolean): Self = StObject.set(x, "hideDownload", value.asInstanceOf[js.Any])
      
      inline def setHideDownloadUndefined: Self = StObject.set(x, "hideDownload", js.undefined)
      
      inline def setHideZoom(value: Boolean): Self = StObject.set(x, "hideZoom", value.asInstanceOf[js.Any])
      
      inline def setHideZoomUndefined: Self = StObject.set(x, "hideZoom", js.undefined)
      
      inline def setImageBackgroundColor(value: String): Self = StObject.set(x, "imageBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setImageBackgroundColorUndefined: Self = StObject.set(x, "imageBackgroundColor", js.undefined)
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setShowRotate(value: Boolean): Self = StObject.set(x, "showRotate", value.asInstanceOf[js.Any])
      
      inline def setShowRotateUndefined: Self = StObject.set(x, "showRotate", js.undefined)
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallSrcSet(value: String): Self = StObject.set(x, "smallSrcSet", value.asInstanceOf[js.Any])
      
      inline def setSmallSrcSetUndefined: Self = StObject.set(x, "smallSrcSet", js.undefined)
    }
  }
}
