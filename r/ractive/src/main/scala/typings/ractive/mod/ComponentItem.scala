package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentItem extends StObject {
  
  var instance: Ractive[Any]
  
  var name: String
}
object ComponentItem {
  
  inline def apply(instance: Ractive[Any], name: String): ComponentItem = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentItem] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: Ractive[Any]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
