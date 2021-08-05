package typings.reactImgix.mod

import typings.react.mod.RefObject
import typings.std.HTMLImageElement
import typings.std.HTMLPictureElement
import typings.std.HTMLSourceElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.undefined
  
  var onMounted: js.UndefOr[
    js.Function1[
      /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]], 
      Unit
    ]
  ] = js.undefined
}
object CommonProps {
  
  inline def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  
  extension [Self <: CommonProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHtmlAttributes(value: ImgixHTMLAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setOnMounted(
      value: /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit
    ): Self = StObject.set(x, "onMounted", js.Any.fromFunction1(value))
    
    inline def setOnMountedUndefined: Self = StObject.set(x, "onMounted", js.undefined)
  }
}
