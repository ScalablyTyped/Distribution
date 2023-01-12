package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountNumber extends StObject {
  
  var amount: Double
}
object AmountNumber {
  
  inline def apply(amount: Double): AmountNumber = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmountNumber] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
