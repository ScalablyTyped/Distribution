package typings.rascal.mod

import typings.rascal.rascalStrings.exchange
import typings.rascal.rascalStrings.queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingConfig extends StObject {
  
  var bindingKey: js.UndefOr[String] = js.native
  
  var bindingKeys: js.UndefOr[js.Array[String]] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var destinationType: js.UndefOr[queue | exchange] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object BindingConfig {
  
  @scala.inline
  def apply(): BindingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingConfig]
  }
  
  @scala.inline
  implicit class BindingConfigMutableBuilder[Self <: BindingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingKey(value: String): Self = StObject.set(x, "bindingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingKeyUndefined: Self = StObject.set(x, "bindingKey", js.undefined)
    
    @scala.inline
    def setBindingKeys(value: js.Array[String]): Self = StObject.set(x, "bindingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingKeysUndefined: Self = StObject.set(x, "bindingKeys", js.undefined)
    
    @scala.inline
    def setBindingKeysVarargs(value: String*): Self = StObject.set(x, "bindingKeys", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(value: queue | exchange): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
