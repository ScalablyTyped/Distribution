package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.anon.CloudConfigResults
import typings.snyk.distLibIacConstantsMod.IacProjectType
import typings.snyk.distLibSnykTestLegacyMod.AnnotatedIssue
import typings.snyk.distLibSnykTestLegacyMod.IgnoreSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedResult extends StObject {
  
  var dependencyCount: Double
  
  var filesystemPolicy: Boolean
  
  var ignoreSettings: IgnoreSettings | Null
  
  var isPrivate: Boolean
  
  var licensesPolicy: js.Object | Null
  
  var meta: TestMeta
  
  @JSName("org")
  var org_ : String
  
  var packageManager: IacProjectType
  
  var policy: String
  
  var projectName: String
  
  var result: CloudConfigResults
  
  var targetFile: String
  
  var targetFilePath: String
  
  var vulnerabilities: js.Array[AnnotatedIssue]
}
object FormattedResult {
  
  inline def apply(
    dependencyCount: Double,
    filesystemPolicy: Boolean,
    isPrivate: Boolean,
    meta: TestMeta,
    org_ : String,
    packageManager: IacProjectType,
    policy: String,
    projectName: String,
    result: CloudConfigResults,
    targetFile: String,
    targetFilePath: String,
    vulnerabilities: js.Array[AnnotatedIssue]
  ): FormattedResult = {
    val __obj = js.Dynamic.literal(dependencyCount = dependencyCount.asInstanceOf[js.Any], filesystemPolicy = filesystemPolicy.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any], targetFilePath = targetFilePath.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], ignoreSettings = null, licensesPolicy = null)
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedResult]
  }
  
  extension [Self <: FormattedResult](x: Self) {
    
    inline def setDependencyCount(value: Double): Self = StObject.set(x, "dependencyCount", value.asInstanceOf[js.Any])
    
    inline def setFilesystemPolicy(value: Boolean): Self = StObject.set(x, "filesystemPolicy", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSettings(value: IgnoreSettings): Self = StObject.set(x, "ignoreSettings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSettingsNull: Self = StObject.set(x, "ignoreSettings", null)
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicy(value: js.Object): Self = StObject.set(x, "licensesPolicy", value.asInstanceOf[js.Any])
    
    inline def setLicensesPolicyNull: Self = StObject.set(x, "licensesPolicy", null)
    
    inline def setMeta(value: TestMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: IacProjectType): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setResult(value: CloudConfigResults): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    
    inline def setTargetFilePath(value: String): Self = StObject.set(x, "targetFilePath", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[AnnotatedIssue]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: AnnotatedIssue*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
