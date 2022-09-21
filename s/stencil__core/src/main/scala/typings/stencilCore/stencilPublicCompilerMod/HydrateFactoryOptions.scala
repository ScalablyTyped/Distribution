package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateFactoryOptions
  extends StObject
     with SerializeDocumentOptions {
  
  var destroyDocument: Boolean
  
  var destroyWindow: Boolean
  
  var serializeToHtml: Boolean
}
object HydrateFactoryOptions {
  
  inline def apply(destroyDocument: Boolean, destroyWindow: Boolean, serializeToHtml: Boolean): HydrateFactoryOptions = {
    val __obj = js.Dynamic.literal(destroyDocument = destroyDocument.asInstanceOf[js.Any], destroyWindow = destroyWindow.asInstanceOf[js.Any], serializeToHtml = serializeToHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateFactoryOptions]
  }
  
  extension [Self <: HydrateFactoryOptions](x: Self) {
    
    inline def setDestroyDocument(value: Boolean): Self = StObject.set(x, "destroyDocument", value.asInstanceOf[js.Any])
    
    inline def setDestroyWindow(value: Boolean): Self = StObject.set(x, "destroyWindow", value.asInstanceOf[js.Any])
    
    inline def setSerializeToHtml(value: Boolean): Self = StObject.set(x, "serializeToHtml", value.asInstanceOf[js.Any])
  }
}
