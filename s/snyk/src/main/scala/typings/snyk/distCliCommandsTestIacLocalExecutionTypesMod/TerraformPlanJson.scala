package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.anon.Rootmodule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformPlanJson extends StObject {
  
  var configuration: Rootmodule
  
  var resource_changes: js.Array[TerraformPlanResourceChange]
}
object TerraformPlanJson {
  
  inline def apply(configuration: Rootmodule, resource_changes: js.Array[TerraformPlanResourceChange]): TerraformPlanJson = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], resource_changes = resource_changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformPlanJson]
  }
  
  extension [Self <: TerraformPlanJson](x: Self) {
    
    inline def setConfiguration(value: Rootmodule): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setResource_changes(value: js.Array[TerraformPlanResourceChange]): Self = StObject.set(x, "resource_changes", value.asInstanceOf[js.Any])
    
    inline def setResource_changesVarargs(value: TerraformPlanResourceChange*): Self = StObject.set(x, "resource_changes", js.Array(value*))
  }
}
