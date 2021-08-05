package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirm extends StObject {
  
  var confirm: Boolean
  
  var options: Mandatory
  
  var vhost: String
}
object Confirm {
  
  inline def apply(confirm: Boolean, options: Mandatory, vhost: String): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
  
  extension [Self <: Confirm](x: Self) {
    
    inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Mandatory): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
  }
}
