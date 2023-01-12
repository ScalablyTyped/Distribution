package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibSnykTestLegacyMod.IgnoreSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMeta extends StObject {
  
  var gitRemoteUrl: js.UndefOr[String] = js.undefined
  
  var ignoreSettings: js.UndefOr[IgnoreSettings | Null] = js.undefined
  
  var isLicensesEnabled: Boolean
  
  var isPrivate: Boolean
  
  var orgPublicId: String
  
  @JSName("org")
  var org_ : String
  
  var policy: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
}
object TestMeta {
  
  inline def apply(isLicensesEnabled: Boolean, isPrivate: Boolean, orgPublicId: String, org_ : String): TestMeta = {
    val __obj = js.Dynamic.literal(isLicensesEnabled = isLicensesEnabled.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], orgPublicId = orgPublicId.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMeta] (val x: Self) extends AnyVal {
    
    inline def setGitRemoteUrl(value: String): Self = StObject.set(x, "gitRemoteUrl", value.asInstanceOf[js.Any])
    
    inline def setGitRemoteUrlUndefined: Self = StObject.set(x, "gitRemoteUrl", js.undefined)
    
    inline def setIgnoreSettings(value: IgnoreSettings): Self = StObject.set(x, "ignoreSettings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSettingsNull: Self = StObject.set(x, "ignoreSettings", null)
    
    inline def setIgnoreSettingsUndefined: Self = StObject.set(x, "ignoreSettings", js.undefined)
    
    inline def setIsLicensesEnabled(value: Boolean): Self = StObject.set(x, "isLicensesEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setOrgPublicId(value: String): Self = StObject.set(x, "orgPublicId", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
