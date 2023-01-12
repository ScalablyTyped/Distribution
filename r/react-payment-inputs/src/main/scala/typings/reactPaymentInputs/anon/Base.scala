package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: String | js.Object
  
  var errored: String | js.Object
}
object Base {
  
  inline def apply(base: String | js.Object, errored: String | js.Object): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String | js.Object): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setErrored(value: String | js.Object): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
  }
}
