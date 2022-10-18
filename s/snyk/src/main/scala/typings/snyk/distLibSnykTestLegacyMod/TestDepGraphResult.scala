package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.anon.BinariesVulns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDepGraphResult extends StObject {
  
  var affectedPkgs: AffectedPackages
  
  var docker: BinariesVulns
  
  var issuesData: StringDictionary[IssueData]
  
  var remediation: js.UndefOr[RemediationChanges] = js.undefined
}
object TestDepGraphResult {
  
  inline def apply(affectedPkgs: AffectedPackages, docker: BinariesVulns, issuesData: StringDictionary[IssueData]): TestDepGraphResult = {
    val __obj = js.Dynamic.literal(affectedPkgs = affectedPkgs.asInstanceOf[js.Any], docker = docker.asInstanceOf[js.Any], issuesData = issuesData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDepGraphResult]
  }
  
  extension [Self <: TestDepGraphResult](x: Self) {
    
    inline def setAffectedPkgs(value: AffectedPackages): Self = StObject.set(x, "affectedPkgs", value.asInstanceOf[js.Any])
    
    inline def setDocker(value: BinariesVulns): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    
    inline def setIssuesData(value: StringDictionary[IssueData]): Self = StObject.set(x, "issuesData", value.asInstanceOf[js.Any])
    
    inline def setRemediation(value: RemediationChanges): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
  }
}
