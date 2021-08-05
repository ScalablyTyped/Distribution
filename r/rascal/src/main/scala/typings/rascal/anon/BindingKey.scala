package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingKey extends StObject {
  
  var bindingKey: String
  
  var destinationType: String
}
object BindingKey {
  
  inline def apply(bindingKey: String, destinationType: String): BindingKey = {
    val __obj = js.Dynamic.literal(bindingKey = bindingKey.asInstanceOf[js.Any], destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingKey]
  }
  
  extension [Self <: BindingKey](x: Self) {
    
    inline def setBindingKey(value: String): Self = StObject.set(x, "bindingKey", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: String): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
  }
}
