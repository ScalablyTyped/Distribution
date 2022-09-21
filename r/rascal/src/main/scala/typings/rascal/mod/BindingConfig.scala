package typings.rascal.mod

import typings.rascal.rascalStrings.exchange
import typings.rascal.rascalStrings.queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingConfig extends StObject {
  
  var bindingKey: js.UndefOr[String] = js.undefined
  
  var bindingKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var destination: js.UndefOr[String] = js.undefined
  
  var destinationType: js.UndefOr[queue | exchange] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object BindingConfig {
  
  inline def apply(): BindingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingConfig]
  }
  
  extension [Self <: BindingConfig](x: Self) {
    
    inline def setBindingKey(value: String): Self = StObject.set(x, "bindingKey", value.asInstanceOf[js.Any])
    
    inline def setBindingKeyUndefined: Self = StObject.set(x, "bindingKey", js.undefined)
    
    inline def setBindingKeys(value: js.Array[String]): Self = StObject.set(x, "bindingKeys", value.asInstanceOf[js.Any])
    
    inline def setBindingKeysUndefined: Self = StObject.set(x, "bindingKeys", js.undefined)
    
    inline def setBindingKeysVarargs(value: String*): Self = StObject.set(x, "bindingKeys", js.Array(value*))
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: queue | exchange): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
