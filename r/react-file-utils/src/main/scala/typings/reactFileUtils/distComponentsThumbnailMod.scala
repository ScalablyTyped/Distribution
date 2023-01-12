package typings.reactFileUtils

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsThumbnailMod {
  
  @JSImport("react-file-utils/dist/components/Thumbnail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Thumbnail(param0: ThumbnailProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Thumbnail")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ThumbnailProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var handleClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: String
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object ThumbnailProps {
    
    inline def apply(image: String): ThumbnailProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThumbnailProps] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setHandleClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClose", js.Any.fromFunction1(value))
      
      inline def setHandleCloseUndefined: Self = StObject.set(x, "handleClose", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
