package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.AssertExchange
import typings.rascal.rascalStrings.direct
import typings.rascal.rascalStrings.fanout
import typings.rascal.rascalStrings.headers
import typings.rascal.rascalStrings.topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeConfig extends StObject {
  
  var assert: js.UndefOr[Boolean] = js.native
  
  var check: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[AssertExchange] = js.native
  
  var `type`: js.UndefOr[direct | fanout | headers | topic] = js.native
}
object ExchangeConfig {
  
  @scala.inline
  def apply(): ExchangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfig]
  }
  
  @scala.inline
  implicit class ExchangeConfigMutableBuilder[Self <: ExchangeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: Boolean): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setOptions(value: AssertExchange): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setType(value: direct | fanout | headers | topic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
