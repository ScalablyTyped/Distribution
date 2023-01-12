package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacEntitlements extends StObject {
  
  var iacCustomRulesEntitlement: js.UndefOr[Boolean] = js.undefined
  
  var iacDrift: js.UndefOr[Boolean] = js.undefined
  
  var infrastructureAsCode: js.UndefOr[Boolean] = js.undefined
}
object IacEntitlements {
  
  inline def apply(): IacEntitlements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IacEntitlements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IacEntitlements] (val x: Self) extends AnyVal {
    
    inline def setIacCustomRulesEntitlement(value: Boolean): Self = StObject.set(x, "iacCustomRulesEntitlement", value.asInstanceOf[js.Any])
    
    inline def setIacCustomRulesEntitlementUndefined: Self = StObject.set(x, "iacCustomRulesEntitlement", js.undefined)
    
    inline def setIacDrift(value: Boolean): Self = StObject.set(x, "iacDrift", value.asInstanceOf[js.Any])
    
    inline def setIacDriftUndefined: Self = StObject.set(x, "iacDrift", js.undefined)
    
    inline def setInfrastructureAsCode(value: Boolean): Self = StObject.set(x, "infrastructureAsCode", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureAsCodeUndefined: Self = StObject.set(x, "infrastructureAsCode", js.undefined)
  }
}
