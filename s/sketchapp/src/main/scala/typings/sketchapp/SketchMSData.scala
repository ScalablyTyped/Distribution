package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSData extends StObject {
  
  var document: SketchMSDocument
  
  var meta: SketchMSMeta
  
  var pages: js.Array[SketchMSPageLayer]
  
  var previews: js.Array[SketchMSPreview]
  
  var user: SketchMSUser
}
object SketchMSData {
  
  inline def apply(
    document: SketchMSDocument,
    meta: SketchMSMeta,
    pages: js.Array[SketchMSPageLayer],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUser
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSData]
  }
  
  extension [Self <: SketchMSData](x: Self) {
    
    inline def setDocument(value: SketchMSDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: SketchMSMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPages(value: js.Array[SketchMSPageLayer]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: SketchMSPageLayer*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    inline def setPreviews(value: js.Array[SketchMSPreview]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
    
    inline def setPreviewsVarargs(value: SketchMSPreview*): Self = StObject.set(x, "previews", js.Array(value :_*))
    
    inline def setUser(value: SketchMSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
