package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibEcosystemsTypesMod.DepsFilePaths
import typings.snyk.distLibEcosystemsTypesMod.FileSignaturesDetails
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDependenciesResult extends StObject {
  
  var depGraphData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraphData */ Any
  
  var dependencyCount: Double
  
  var depsFilePaths: js.UndefOr[DepsFilePaths] = js.undefined
  
  var docker: js.UndefOr[typings.snyk.anon.BaseImageRemediation] = js.undefined
  
  var fileSignaturesDetails: FileSignaturesDetails
  
  var issues: js.Array[Issue]
  
  var issuesData: StringDictionary[IssueData]
  
  var packageManager: SupportedProjectTypes
  
  var path: String
  
  var remediation: js.UndefOr[RemediationChanges] = js.undefined
  
  var vulnerabilities: js.Array[IssueData]
}
object TestDependenciesResult {
  
  inline def apply(
    depGraphData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraphData */ Any,
    dependencyCount: Double,
    fileSignaturesDetails: FileSignaturesDetails,
    issues: js.Array[Issue],
    issuesData: StringDictionary[IssueData],
    packageManager: SupportedProjectTypes,
    path: String,
    vulnerabilities: js.Array[IssueData]
  ): TestDependenciesResult = {
    val __obj = js.Dynamic.literal(depGraphData = depGraphData.asInstanceOf[js.Any], dependencyCount = dependencyCount.asInstanceOf[js.Any], fileSignaturesDetails = fileSignaturesDetails.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesData = issuesData.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDependenciesResult]
  }
  
  extension [Self <: TestDependenciesResult](x: Self) {
    
    inline def setDepGraphData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraphData */ Any
    ): Self = StObject.set(x, "depGraphData", value.asInstanceOf[js.Any])
    
    inline def setDependencyCount(value: Double): Self = StObject.set(x, "dependencyCount", value.asInstanceOf[js.Any])
    
    inline def setDepsFilePaths(value: DepsFilePaths): Self = StObject.set(x, "depsFilePaths", value.asInstanceOf[js.Any])
    
    inline def setDepsFilePathsUndefined: Self = StObject.set(x, "depsFilePaths", js.undefined)
    
    inline def setDocker(value: typings.snyk.anon.BaseImageRemediation): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
    
    inline def setFileSignaturesDetails(value: FileSignaturesDetails): Self = StObject.set(x, "fileSignaturesDetails", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesData(value: StringDictionary[IssueData]): Self = StObject.set(x, "issuesData", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setPackageManager(value: SupportedProjectTypes): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRemediation(value: RemediationChanges): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setVulnerabilities(value: js.Array[IssueData]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: IssueData*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
