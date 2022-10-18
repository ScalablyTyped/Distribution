package typings.sentryUtils.anon

import typings.sentryUtils.typesRequestdataMod.TransactionNamingScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  var ip: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var transaction: js.UndefOr[Boolean | TransactionNamingScheme] = js.undefined
  
  var user: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}
object Ip {
  
  inline def apply(): Ip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ip]
  }
  
  extension [Self <: Ip](x: Self) {
    
    inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setRequest(value: Boolean | js.Array[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: String*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setTransaction(value: Boolean | TransactionNamingScheme): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setUser(value: Boolean | js.Array[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(value: String*): Self = StObject.set(x, "user", js.Array(value*))
  }
}
