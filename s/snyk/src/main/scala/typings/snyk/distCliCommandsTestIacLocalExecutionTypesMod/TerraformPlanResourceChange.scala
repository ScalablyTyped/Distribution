package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<snyk.snyk/dist/cli/commands/test/iac/local-execution/types.TerraformPlanResource, 'values'> */
trait TerraformPlanResourceChange extends StObject {
  
  var address: String
  
  var change: Actions
  
  var index: Double | String
  
  var mode: String
  
  var name: String
  
  var `type`: String
}
object TerraformPlanResourceChange {
  
  inline def apply(
    address: String,
    change: Actions,
    index: Double | String,
    mode: String,
    name: String,
    `type`: String
  ): TerraformPlanResourceChange = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformPlanResourceChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerraformPlanResourceChange] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setChange(value: Actions): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
