package typings.reactRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticContext extends StObject {
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object StaticContext {
  
  inline def apply(): StaticContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticContext]
  }
  
  extension [Self <: StaticContext](x: Self) {
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
