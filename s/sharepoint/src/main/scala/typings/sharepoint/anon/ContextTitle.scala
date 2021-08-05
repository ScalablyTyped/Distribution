package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTitle extends StObject {
  
  var contextTitle: String
  
  var openDocumentsInClient: Boolean
}
object ContextTitle {
  
  inline def apply(contextTitle: String, openDocumentsInClient: Boolean): ContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTitle]
  }
  
  extension [Self <: ContextTitle](x: Self) {
    
    inline def setContextTitle(value: String): Self = StObject.set(x, "contextTitle", value.asInstanceOf[js.Any])
    
    inline def setOpenDocumentsInClient(value: Boolean): Self = StObject.set(x, "openDocumentsInClient", value.asInstanceOf[js.Any])
  }
}
