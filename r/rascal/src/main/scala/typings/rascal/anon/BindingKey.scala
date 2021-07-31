package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingKey extends StObject {
  
  var bindingKey: String
  
  var destinationType: String
}
object BindingKey {
  
  @scala.inline
  def apply(bindingKey: String, destinationType: String): BindingKey = {
    val __obj = js.Dynamic.literal(bindingKey = bindingKey.asInstanceOf[js.Any], destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingKey]
  }
  
  @scala.inline
  implicit class BindingKeyMutableBuilder[Self <: BindingKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingKey(value: String): Self = StObject.set(x, "bindingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(value: String): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
  }
}
