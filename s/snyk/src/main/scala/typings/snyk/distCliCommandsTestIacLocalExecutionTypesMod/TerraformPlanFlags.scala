package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformPlanFlags extends StObject {
  
  var scan: js.UndefOr[TerraformPlanScanMode] = js.undefined
}
object TerraformPlanFlags {
  
  inline def apply(): TerraformPlanFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerraformPlanFlags]
  }
  
  extension [Self <: TerraformPlanFlags](x: Self) {
    
    inline def setScan(value: TerraformPlanScanMode): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
    
    inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
  }
}
