package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait spFriendlyUrlPageContextInfo extends StObject {
  
  var termId: String
  
  var termSetId: String
  
  var termStoreId: String
  
  var title: String
}
object spFriendlyUrlPageContextInfo {
  
  inline def apply(termId: String, termSetId: String, termStoreId: String, title: String): spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId.asInstanceOf[js.Any], termSetId = termSetId.asInstanceOf[js.Any], termStoreId = termStoreId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[spFriendlyUrlPageContextInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: spFriendlyUrlPageContextInfo] (val x: Self) extends AnyVal {
    
    inline def setTermId(value: String): Self = StObject.set(x, "termId", value.asInstanceOf[js.Any])
    
    inline def setTermSetId(value: String): Self = StObject.set(x, "termSetId", value.asInstanceOf[js.Any])
    
    inline def setTermStoreId(value: String): Self = StObject.set(x, "termStoreId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
