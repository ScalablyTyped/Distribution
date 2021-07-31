package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextTitle extends StObject {
  
  var contextTitle: String
  
  var openDocumentsInClient: Boolean
}
object ContextTitle {
  
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): ContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTitle]
  }
  
  @scala.inline
  implicit class ContextTitleMutableBuilder[Self <: ContextTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextTitle(value: String): Self = StObject.set(x, "contextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDocumentsInClient(value: Boolean): Self = StObject.set(x, "openDocumentsInClient", value.asInstanceOf[js.Any])
  }
}
