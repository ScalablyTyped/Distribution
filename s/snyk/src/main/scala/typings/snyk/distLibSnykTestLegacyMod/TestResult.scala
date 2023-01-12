package typings.snyk.distLibSnykTestLegacyMod

import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult
  extends StObject
     with LegacyVulnApiResult {
  
  var displayTargetFile: js.UndefOr[String] = js.undefined
  
  var foundProjectCount: js.UndefOr[Double] = js.undefined
  
  var projectName: js.UndefOr[String] = js.undefined
  
  var scanResult: js.UndefOr[ScanResult] = js.undefined
  
  var targetFile: js.UndefOr[String] = js.undefined
  
  var targetFilePath: js.UndefOr[String] = js.undefined
}
object TestResult {
  
  inline def apply(
    dependencyCount: Double,
    isPrivate: Boolean,
    ok: Boolean,
    org_ : String,
    policy: String,
    summary: String,
    vulnerabilities: js.Array[AnnotatedIssue]
  ): TestResult = {
    val __obj = js.Dynamic.literal(dependencyCount = dependencyCount.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], ignoreSettings = null, licensesPolicy = null)
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
    
    inline def setDisplayTargetFile(value: String): Self = StObject.set(x, "displayTargetFile", value.asInstanceOf[js.Any])
    
    inline def setDisplayTargetFileUndefined: Self = StObject.set(x, "displayTargetFile", js.undefined)
    
    inline def setFoundProjectCount(value: Double): Self = StObject.set(x, "foundProjectCount", value.asInstanceOf[js.Any])
    
    inline def setFoundProjectCountUndefined: Self = StObject.set(x, "foundProjectCount", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "scanResult", value.asInstanceOf[js.Any])
    
    inline def setScanResultUndefined: Self = StObject.set(x, "scanResult", js.undefined)
    
    inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    
    inline def setTargetFilePath(value: String): Self = StObject.set(x, "targetFilePath", value.asInstanceOf[js.Any])
    
    inline def setTargetFilePathUndefined: Self = StObject.set(x, "targetFilePath", js.undefined)
    
    inline def setTargetFileUndefined: Self = StObject.set(x, "targetFile", js.undefined)
  }
}
