package typings.steamUser.anon

import typings.steamUser.mod.ECurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balance extends StObject {
  
  var balance: Double
  
  var currency: ECurrencyCode
  
  var hasWallet: Boolean
}
object Balance {
  
  inline def apply(balance: Double, currency: ECurrencyCode, hasWallet: Boolean): Balance = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], hasWallet = hasWallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Balance] (val x: Self) extends AnyVal {
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: ECurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setHasWallet(value: Boolean): Self = StObject.set(x, "hasWallet", value.asInstanceOf[js.Any])
  }
}
