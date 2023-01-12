package typings.schematicsAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angular extends StObject {
  
  var Angular: String
  
  var DevkitBuildAngular: String
}
object Angular {
  
  inline def apply(Angular: String, DevkitBuildAngular: String): Angular = {
    val __obj = js.Dynamic.literal(Angular = Angular.asInstanceOf[js.Any], DevkitBuildAngular = DevkitBuildAngular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angular]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angular] (val x: Self) extends AnyVal {
    
    inline def setAngular(value: String): Self = StObject.set(x, "Angular", value.asInstanceOf[js.Any])
    
    inline def setDevkitBuildAngular(value: String): Self = StObject.set(x, "DevkitBuildAngular", value.asInstanceOf[js.Any])
  }
}
