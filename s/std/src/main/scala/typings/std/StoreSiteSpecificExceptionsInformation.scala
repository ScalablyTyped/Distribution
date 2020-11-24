package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSiteSpecificExceptionsInformation extends StoreExceptionsInformation {
  
  var arrayOfDomainStrings: js.UndefOr[js.Array[java.lang.String]] = js.native
}
object StoreSiteSpecificExceptionsInformation {
  
  @scala.inline
  def apply(): StoreSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSiteSpecificExceptionsInformation]
  }
  
  @scala.inline
  implicit class StoreSiteSpecificExceptionsInformationOps[Self <: StoreSiteSpecificExceptionsInformation] (val x: Self) extends AnyVal {
    
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
    def setArrayOfDomainStringsVarargs(value: java.lang.String*): Self = this.set("arrayOfDomainStrings", js.Array(value :_*))
    
    @scala.inline
    def setArrayOfDomainStrings(value: js.Array[java.lang.String]): Self = this.set("arrayOfDomainStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayOfDomainStrings: Self = this.set("arrayOfDomainStrings", js.undefined)
  }
}
