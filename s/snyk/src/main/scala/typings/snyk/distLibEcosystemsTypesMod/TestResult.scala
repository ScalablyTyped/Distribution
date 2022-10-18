package typings.snyk.distLibEcosystemsTypesMod

import typings.snyk.distLibSnykTestLegacyMod.RemediationChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  var depGraphData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphData */ Any
  
  var depsFilePaths: js.UndefOr[DepsFilePaths] = js.undefined
  
  var fileSignaturesDetails: js.UndefOr[FileSignaturesDetails] = js.undefined
  
  var issues: js.Array[Issue]
  
  var issuesData: IssuesData
  
  var remediation: js.UndefOr[RemediationChanges] = js.undefined
}
object TestResult {
  
  inline def apply(
    depGraphData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphData */ Any,
    issues: js.Array[Issue],
    issuesData: IssuesData
  ): TestResult = {
    val __obj = js.Dynamic.literal(depGraphData = depGraphData.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesData = issuesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  
  extension [Self <: TestResult](x: Self) {
    
    inline def setDepGraphData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphData */ Any
    ): Self = StObject.set(x, "depGraphData", value.asInstanceOf[js.Any])
    
    inline def setDepsFilePaths(value: DepsFilePaths): Self = StObject.set(x, "depsFilePaths", value.asInstanceOf[js.Any])
    
    inline def setDepsFilePathsUndefined: Self = StObject.set(x, "depsFilePaths", js.undefined)
    
    inline def setFileSignaturesDetails(value: FileSignaturesDetails): Self = StObject.set(x, "fileSignaturesDetails", value.asInstanceOf[js.Any])
    
    inline def setFileSignaturesDetailsUndefined: Self = StObject.set(x, "fileSignaturesDetails", js.undefined)
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesData(value: IssuesData): Self = StObject.set(x, "issuesData", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setRemediation(value: RemediationChanges): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
  }
}
