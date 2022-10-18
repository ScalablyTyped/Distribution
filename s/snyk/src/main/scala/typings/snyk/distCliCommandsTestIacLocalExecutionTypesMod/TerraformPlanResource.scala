package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformPlanResource extends StObject {
  
  var address: String
  
  var index: Double | String
  
  var mode: String
  
  var name: String
  
  var `type`: String
  
  var values: Record[String, Any]
}
object TerraformPlanResource {
  
  inline def apply(
    address: String,
    index: Double | String,
    mode: String,
    name: String,
    `type`: String,
    values: Record[String, Any]
  ): TerraformPlanResource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformPlanResource]
  }
  
  extension [Self <: TerraformPlanResource](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Record[String, Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
