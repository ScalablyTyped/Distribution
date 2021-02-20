package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait spFriendlyUrlPageContextInfo extends StObject {
  
  var termId: String = js.native
  
  var termSetId: String = js.native
  
  var termStoreId: String = js.native
  
  var title: String = js.native
}
object spFriendlyUrlPageContextInfo {
  
  @scala.inline
  def apply(termId: String, termSetId: String, termStoreId: String, title: String): spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId.asInstanceOf[js.Any], termSetId = termSetId.asInstanceOf[js.Any], termStoreId = termStoreId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[spFriendlyUrlPageContextInfo]
  }
  
  @scala.inline
  implicit class spFriendlyUrlPageContextInfoMutableBuilder[Self <: spFriendlyUrlPageContextInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTermId(value: String): Self = StObject.set(x, "termId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermSetId(value: String): Self = StObject.set(x, "termSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermStoreId(value: String): Self = StObject.set(x, "termStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
