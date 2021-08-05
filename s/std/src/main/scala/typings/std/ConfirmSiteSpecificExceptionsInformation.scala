package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSiteSpecificExceptionsInformation
  extends StObject
     with ExceptionInformation {
  
  var arrayOfDomainStrings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
object ConfirmSiteSpecificExceptionsInformation {
  
  inline def apply(): ConfirmSiteSpecificExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSiteSpecificExceptionsInformation]
  }
  
  extension [Self <: ConfirmSiteSpecificExceptionsInformation](x: Self) {
    
    inline def setArrayOfDomainStrings(value: js.Array[java.lang.String]): Self = StObject.set(x, "arrayOfDomainStrings", value.asInstanceOf[js.Any])
    
    inline def setArrayOfDomainStringsUndefined: Self = StObject.set(x, "arrayOfDomainStrings", js.undefined)
    
    inline def setArrayOfDomainStringsVarargs(value: java.lang.String*): Self = StObject.set(x, "arrayOfDomainStrings", js.Array(value :_*))
  }
}
