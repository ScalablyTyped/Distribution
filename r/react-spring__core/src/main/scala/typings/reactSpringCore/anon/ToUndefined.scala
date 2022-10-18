package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToUndefined extends StObject {
  
  var to: Unit
}
object ToUndefined {
  
  inline def apply(to: Unit): ToUndefined = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToUndefined]
  }
  
  extension [Self <: ToUndefined](x: Self) {
    
    inline def setTo(value: Unit): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
