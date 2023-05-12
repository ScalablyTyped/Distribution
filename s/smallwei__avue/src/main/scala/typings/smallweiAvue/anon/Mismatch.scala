package typings.smallweiAvue.anon

import typings.smallweiAvue.FullField
import typings.smallweiAvue.Pattern
import typings.smallweiAvue.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mismatch extends StObject {
  
  var mismatch: js.UndefOr[ValidateMessage[js.Tuple3[FullField, typings.smallweiAvue.Value, Pattern]]] = js.undefined
}
object Mismatch {
  
  inline def apply(): Mismatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mismatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mismatch] (val x: Self) extends AnyVal {
    
    inline def setMismatch(value: ValidateMessage[js.Tuple3[FullField, typings.smallweiAvue.Value, Pattern]]): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
    
    inline def setMismatchFunction1(value: js.Tuple3[FullField, typings.smallweiAvue.Value, Pattern] => String): Self = StObject.set(x, "mismatch", js.Any.fromFunction1(value))
    
    inline def setMismatchUndefined: Self = StObject.set(x, "mismatch", js.undefined)
  }
}
