package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSData extends StObject {
  
  var document: SketchMSDocument = js.native
  
  var meta: SketchMSMeta = js.native
  
  var pages: js.Array[SketchMSPageLayer] = js.native
  
  var previews: js.Array[SketchMSPreview] = js.native
  
  var user: SketchMSUser = js.native
}
object SketchMSData {
  
  @scala.inline
  def apply(
    document: SketchMSDocument,
    meta: SketchMSMeta,
    pages: js.Array[SketchMSPageLayer],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUser
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSData]
  }
  
  @scala.inline
  implicit class SketchMSDataMutableBuilder[Self <: SketchMSData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SketchMSDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: SketchMSMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: js.Array[SketchMSPageLayer]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: SketchMSPageLayer*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setPreviews(value: js.Array[SketchMSPreview]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewsVarargs(value: SketchMSPreview*): Self = StObject.set(x, "previews", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: SketchMSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
