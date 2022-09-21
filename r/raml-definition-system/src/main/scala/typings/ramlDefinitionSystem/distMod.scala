package typings.ramlDefinitionSystem

import typings.tsStructureModel.mod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("raml-definition-system/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-definition-system/dist", "universeDumps")
  @js.native
  def universeDumps: JSONDump = js.native
  inline def universeDumps_=(x: JSONDump): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("universeDumps")(x.asInstanceOf[js.Any])
  
  trait JSONDump extends StObject {
    
    var RAML08: Module
    
    var RAML10: Module
  }
  object JSONDump {
    
    inline def apply(RAML08: Module, RAML10: Module): JSONDump = {
      val __obj = js.Dynamic.literal(RAML08 = RAML08.asInstanceOf[js.Any], RAML10 = RAML10.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONDump]
    }
    
    extension [Self <: JSONDump](x: Self) {
      
      inline def setRAML08(value: Module): Self = StObject.set(x, "RAML08", value.asInstanceOf[js.Any])
      
      inline def setRAML10(value: Module): Self = StObject.set(x, "RAML10", value.asInstanceOf[js.Any])
    }
  }
}
