package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFParams extends StObject {
  
  var page: js.UndefOr[ImgixParamType] = js.native
}
object PDFParams {
  
  @scala.inline
  def apply(): PDFParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFParams]
  }
  
  @scala.inline
  implicit class PDFParamsMutableBuilder[Self <: PDFParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: ImgixParamType): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
