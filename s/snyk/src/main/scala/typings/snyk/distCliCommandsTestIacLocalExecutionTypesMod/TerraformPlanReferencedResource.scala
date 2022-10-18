package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformPlanReferencedResource
  extends StObject
     with TerraformPlanResource {
  
  var expressions: js.UndefOr[Record[String, TerraformPlanExpression]] = js.undefined
}
object TerraformPlanReferencedResource {
  
  inline def apply(
    address: String,
    index: Double | String,
    mode: String,
    name: String,
    `type`: String,
    values: Record[String, Any]
  ): TerraformPlanReferencedResource = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformPlanReferencedResource]
  }
  
  extension [Self <: TerraformPlanReferencedResource](x: Self) {
    
    inline def setExpressions(value: Record[String, TerraformPlanExpression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
