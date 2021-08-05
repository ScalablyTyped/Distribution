package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.rascal.rascalStrings.direct
import typings.rascal.rascalStrings.fanout
import typings.rascal.rascalStrings.headers
import typings.rascal.rascalStrings.topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeConfig extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.undefined
  
  var check: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[AssertExchange] = js.undefined
  
  var `type`: js.UndefOr[direct | fanout | headers | topic] = js.undefined
}
object ExchangeConfig {
  
  inline def apply(): ExchangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfig]
  }
  
  extension [Self <: ExchangeConfig](x: Self) {
    
    inline def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setOptions(value: AssertExchange): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: direct | fanout | headers | topic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
