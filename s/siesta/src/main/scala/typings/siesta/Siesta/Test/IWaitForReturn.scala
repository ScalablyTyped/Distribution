package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWaitForReturn extends StObject {
  
  var force: js.Function
}
object IWaitForReturn {
  
  inline def apply(force: js.Function): IWaitForReturn = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForReturn]
  }
  
  extension [Self <: IWaitForReturn](x: Self) {
    
    inline def setForce(value: js.Function): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
