package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFParams extends StObject {
  
  var page: js.UndefOr[ImgixParamType] = js.undefined
  
  var `pdf-annotation`: js.UndefOr[ImgixParamType] = js.undefined
}
object PDFParams {
  
  inline def apply(): PDFParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFParams] (val x: Self) extends AnyVal {
    
    inline def setPage(value: ImgixParamType): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def `setPdf-annotation`(value: ImgixParamType): Self = StObject.set(x, "pdf-annotation", value.asInstanceOf[js.Any])
    
    inline def `setPdf-annotationUndefined`: Self = StObject.set(x, "pdf-annotation", js.undefined)
  }
}
