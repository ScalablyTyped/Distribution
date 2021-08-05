package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sep extends StObject {
  
  var sep: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Sep {
  
  inline def apply(): Sep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sep]
  }
  
  extension [Self <: Sep](x: Self) {
    
    inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
    
    inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
