package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionInformation extends StObject {
  
  var domain: js.UndefOr[java.lang.String | Null] = js.undefined
}
object ExceptionInformation {
  
  inline def apply(): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionInformation]
  }
  
  extension [Self <: ExceptionInformation](x: Self) {
    
    inline def setDomain(value: java.lang.String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
