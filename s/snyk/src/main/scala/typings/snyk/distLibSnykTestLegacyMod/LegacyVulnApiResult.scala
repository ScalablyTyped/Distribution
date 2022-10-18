package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.anon.BaseImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyVulnApiResult
  extends StObject
     with BasicResultData {
  
  var dependencyCount: Double
  
  var docker: js.UndefOr[BaseImage] = js.undefined
  
  var filesystemPolicy: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSettings: IgnoreSettings | Null
  
  var licensesPolicy: js.Object | Null
  
  var policy: String
  
  var projectId: js.UndefOr[String] = js.undefined
  
  var remediation: js.UndefOr[RemediationChanges] = js.undefined
  
  var uniqueCount: js.UndefOr[Any] = js.undefined
  
  var vulnerabilities: js.Array[AnnotatedIssue]
}
object LegacyVulnApiResult {
  
  inline def apply(
    dependencyCount: Double,
    isPrivate: Boolean,
    ok: Boolean,
    org_ : String,
    policy: String,
    summary: String,
    vulnerabilities: js.Array[AnnotatedIssue]
  ): LegacyVulnApiResult = {
    val __obj = js.Dynamic.literal(dependencyCount = dependencyCount.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], ignoreSettings = null, licensesPolicy = null)
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyVulnApiResult]
  }
  
  extension [Self <: LegacyVulnApiResult](x: Self) {
    
    inline def setDependencyCount(value: Double): Self = StObject.set(x, "dependencyCount", value.asInstanceOf[js.Any])
    
    inline def setDocker(value: BaseImage): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
    
    inline def setFilesystemPolicy(value: Boolean): Self = StObject.set(x, "filesystemPolicy", value.asInstanceOf[js.Any])
    
    inline def setFilesystemPolicyUndefined: Self = StObject.set(x, "filesystemPolicy", js.undefined)
    
    inline def setIgnoreSettings(value: IgnoreSettings): Self = StObject.set(x, "ignoreSettings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSettingsNull: Self = StObject.set(x, "ignoreSettings", null)
    
    inline def setLicensesPolicy(value: js.Object): Self = StObject.set(x, "licensesPolicy", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicyNull: Self = StObject.set(x, "licensesPolicy", null)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRemediation(value: RemediationChanges): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setUniqueCount(value: Any): Self = StObject.set(x, "uniqueCount", value.asInstanceOf[js.Any])
    
    inline def setUniqueCountUndefined: Self = StObject.set(x, "uniqueCount", js.undefined)
    
    inline def setVulnerabilities(value: js.Array[AnnotatedIssue]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: AnnotatedIssue*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
