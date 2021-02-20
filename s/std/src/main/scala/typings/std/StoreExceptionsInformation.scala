package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreExceptionsInformation extends ExceptionInformation {
  
  var detailURI: js.UndefOr[java.lang.String | Null] = js.native
  
  var explanationString: js.UndefOr[java.lang.String | Null] = js.native
  
  var siteName: js.UndefOr[java.lang.String | Null] = js.native
}
object StoreExceptionsInformation {
  
  @scala.inline
  def apply(): StoreExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreExceptionsInformation]
  }
  
  @scala.inline
  implicit class StoreExceptionsInformationMutableBuilder[Self <: StoreExceptionsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailURI(value: java.lang.String): Self = StObject.set(x, "detailURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailURINull: Self = StObject.set(x, "detailURI", null)
    
    @scala.inline
    def setDetailURIUndefined: Self = StObject.set(x, "detailURI", js.undefined)
    
    @scala.inline
    def setExplanationString(value: java.lang.String): Self = StObject.set(x, "explanationString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationStringNull: Self = StObject.set(x, "explanationString", null)
    
    @scala.inline
    def setExplanationStringUndefined: Self = StObject.set(x, "explanationString", js.undefined)
    
    @scala.inline
    def setSiteName(value: java.lang.String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteNameNull: Self = StObject.set(x, "siteName", null)
    
    @scala.inline
    def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
  }
}
