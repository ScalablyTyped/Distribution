package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacOrgSettings extends StObject {
  
  var customPolicies: IacCustomPolicies
  
  var customRules: js.UndefOr[IacCustomRules] = js.undefined
  
  var entitlements: js.UndefOr[IacEntitlements] = js.undefined
  
  var meta: TestMeta
}
object IacOrgSettings {
  
  inline def apply(customPolicies: IacCustomPolicies, meta: TestMeta): IacOrgSettings = {
    val __obj = js.Dynamic.literal(customPolicies = customPolicies.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacOrgSettings]
  }
  
  extension [Self <: IacOrgSettings](x: Self) {
    
    inline def setCustomPolicies(value: IacCustomPolicies): Self = StObject.set(x, "customPolicies", value.asInstanceOf[js.Any])
    
    inline def setCustomRules(value: IacCustomRules): Self = StObject.set(x, "customRules", value.asInstanceOf[js.Any])
    
    inline def setCustomRulesUndefined: Self = StObject.set(x, "customRules", js.undefined)
    
    inline def setEntitlements(value: IacEntitlements): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
    
    inline def setMeta(value: TestMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
