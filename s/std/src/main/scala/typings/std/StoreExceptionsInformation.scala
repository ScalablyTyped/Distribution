package typings.std

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
  implicit class StoreExceptionsInformationOps[Self <: StoreExceptionsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetailURI(value: java.lang.String): Self = this.set("detailURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailURI: Self = this.set("detailURI", js.undefined)
    
    @scala.inline
    def setDetailURINull: Self = this.set("detailURI", null)
    
    @scala.inline
    def setExplanationString(value: java.lang.String): Self = this.set("explanationString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanationString: Self = this.set("explanationString", js.undefined)
    
    @scala.inline
    def setExplanationStringNull: Self = this.set("explanationString", null)
    
    @scala.inline
    def setSiteName(value: java.lang.String): Self = this.set("siteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteName: Self = this.set("siteName", js.undefined)
    
    @scala.inline
    def setSiteNameNull: Self = this.set("siteName", null)
  }
}
