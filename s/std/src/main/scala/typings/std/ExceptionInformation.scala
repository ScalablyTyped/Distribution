package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionInformation extends StObject {
  
  var domain: js.UndefOr[java.lang.String | Null] = js.undefined
}
object ExceptionInformation {
  
  @scala.inline
  def apply(): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionInformation]
  }
  
  @scala.inline
  implicit class ExceptionInformationMutableBuilder[Self <: ExceptionInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: java.lang.String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNull: Self = StObject.set(x, "domain", null)
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
