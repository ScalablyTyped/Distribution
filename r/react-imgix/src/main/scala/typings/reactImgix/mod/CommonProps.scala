package typings.reactImgix.mod

import typings.react.mod.RefObject
import typings.std.HTMLImageElement
import typings.std.HTMLPictureElement
import typings.std.HTMLSourceElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.native
  
  var onMounted: js.UndefOr[
    js.Function1[
      /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]], 
      Unit
    ]
  ] = js.native
}
object CommonProps {
  
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  
  @scala.inline
  implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: ImgixHTMLAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    @scala.inline
    def setOnMounted(
      value: /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit
    ): Self = StObject.set(x, "onMounted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMountedUndefined: Self = StObject.set(x, "onMounted", js.undefined)
  }
}
