package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errored extends StObject {
  
  var base: String | js.Object
  
  var errored: String | js.Object
  
  var focused: String | js.Object
}
object Errored {
  
  inline def apply(base: String | js.Object, errored: String | js.Object, focused: String | js.Object): Errored = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], errored = errored.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errored]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Errored] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String | js.Object): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setErrored(value: String | js.Object): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: String | js.Object): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
  }
}
