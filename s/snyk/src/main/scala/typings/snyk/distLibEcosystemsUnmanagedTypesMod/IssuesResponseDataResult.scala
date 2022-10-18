package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import typings.snyk.distLibEcosystemsTypesMod.DepsFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesResponseDataResult extends StObject {
  
  var dep_graph: DepGraphDataOpenAPI
  
  var deps_file_paths: DepsFilePaths
  
  var file_signatures_details: FileSignaturesDetailsOpenApi
  
  var issues: js.Array[IssueOpenApi]
  
  var issues_data: IssuesDataOpenApi
  
  var start_time: String
  
  var `type`: String
}
object IssuesResponseDataResult {
  
  inline def apply(
    dep_graph: DepGraphDataOpenAPI,
    deps_file_paths: DepsFilePaths,
    file_signatures_details: FileSignaturesDetailsOpenApi,
    issues: js.Array[IssueOpenApi],
    issues_data: IssuesDataOpenApi,
    start_time: String,
    `type`: String
  ): IssuesResponseDataResult = {
    val __obj = js.Dynamic.literal(dep_graph = dep_graph.asInstanceOf[js.Any], deps_file_paths = deps_file_paths.asInstanceOf[js.Any], file_signatures_details = file_signatures_details.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issues_data = issues_data.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesResponseDataResult]
  }
  
  extension [Self <: IssuesResponseDataResult](x: Self) {
    
    inline def setDep_graph(value: DepGraphDataOpenAPI): Self = StObject.set(x, "dep_graph", value.asInstanceOf[js.Any])
    
    inline def setDeps_file_paths(value: DepsFilePaths): Self = StObject.set(x, "deps_file_paths", value.asInstanceOf[js.Any])
    
    inline def setFile_signatures_details(value: FileSignaturesDetailsOpenApi): Self = StObject.set(x, "file_signatures_details", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: js.Array[IssueOpenApi]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: IssueOpenApi*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setIssues_data(value: IssuesDataOpenApi): Self = StObject.set(x, "issues_data", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
