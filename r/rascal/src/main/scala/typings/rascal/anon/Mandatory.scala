package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mandatory extends StObject {
  
  var mandatory: Boolean
  
  var persistent: Boolean
}
object Mandatory {
  
  inline def apply(mandatory: Boolean, persistent: Boolean): Mandatory = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mandatory]
  }
  
  extension [Self <: Mandatory](x: Self) {
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
  }
}
