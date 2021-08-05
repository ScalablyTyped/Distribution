package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ulimit extends StObject {
  
  var hardLimit: Double
  
  var name: UlimitName
  
  var softLimit: Double
}
object Ulimit {
  
  inline def apply(hardLimit: Double, name: UlimitName, softLimit: Double): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  
  extension [Self <: Ulimit](x: Self) {
    
    inline def setHardLimit(value: Double): Self = StObject.set(x, "hardLimit", value.asInstanceOf[js.Any])
    
    inline def setName(value: UlimitName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSoftLimit(value: Double): Self = StObject.set(x, "softLimit", value.asInstanceOf[js.Any])
  }
}
