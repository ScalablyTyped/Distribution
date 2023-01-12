package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.anon.Severities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDepGraphMeta extends StObject {
  
  var ignoreSettings: js.UndefOr[IgnoreSettings] = js.undefined
  
  var isLicensesEnabled: Boolean
  
  var isPublic: Boolean
  
  var licensesPolicy: js.UndefOr[Severities] = js.undefined
  
  @JSName("org")
  var org_ : String
  
  var policy: String
  
  var projectId: js.UndefOr[String] = js.undefined
}
object TestDepGraphMeta {
  
  inline def apply(isLicensesEnabled: Boolean, isPublic: Boolean, org_ : String, policy: String): TestDepGraphMeta = {
    val __obj = js.Dynamic.literal(isLicensesEnabled = isLicensesEnabled.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDepGraphMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestDepGraphMeta] (val x: Self) extends AnyVal {
    
    inline def setIgnoreSettings(value: IgnoreSettings): Self = StObject.set(x, "ignoreSettings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSettingsUndefined: Self = StObject.set(x, "ignoreSettings", js.undefined)
    
    inline def setIsLicensesEnabled(value: Boolean): Self = StObject.set(x, "isLicensesEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicy(value: Severities): Self = StObject.set(x, "licensesPolicy", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicyUndefined: Self = StObject.set(x, "licensesPolicy", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
