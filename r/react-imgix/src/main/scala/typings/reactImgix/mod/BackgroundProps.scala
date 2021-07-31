package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var disableLibraryParam: js.UndefOr[Boolean] = js.undefined
  
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.undefined
  
  var imgixParams: js.UndefOr[ImigixParams] = js.undefined
  
  var src: String
}
object BackgroundProps {
  
  @scala.inline
  def apply(src: String): BackgroundProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps]
  }
  
  @scala.inline
  implicit class BackgroundPropsMutableBuilder[Self <: BackgroundProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisableLibraryParam(value: Boolean): Self = StObject.set(x, "disableLibraryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLibraryParamUndefined: Self = StObject.set(x, "disableLibraryParam", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: ImgixHTMLAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    @scala.inline
    def setImgixParams(value: ImigixParams): Self = StObject.set(x, "imgixParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgixParamsUndefined: Self = StObject.set(x, "imgixParams", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
