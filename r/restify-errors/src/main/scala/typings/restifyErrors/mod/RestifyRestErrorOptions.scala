package typings.restifyErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestifyRestErrorOptions
  extends StObject
     with RestifyHttpErrorOptions {
  
  var restCode: js.UndefOr[String] = js.undefined
}
object RestifyRestErrorOptions {
  
  inline def apply(): RestifyRestErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
  
  extension [Self <: RestifyRestErrorOptions](x: Self) {
    
    inline def setRestCode(value: String): Self = StObject.set(x, "restCode", value.asInstanceOf[js.Any])
    
    inline def setRestCodeUndefined: Self = StObject.set(x, "restCode", js.undefined)
  }
}
