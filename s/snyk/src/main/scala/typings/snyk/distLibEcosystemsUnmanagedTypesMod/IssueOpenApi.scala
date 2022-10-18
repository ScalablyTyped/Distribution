package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueOpenApi extends StObject {
  
  var fix_info: FixInfoOpenApi
  
  var issue_id: String
  
  var pkg_name: String
  
  var pkg_version: js.UndefOr[String] = js.undefined
}
object IssueOpenApi {
  
  inline def apply(fix_info: FixInfoOpenApi, issue_id: String, pkg_name: String): IssueOpenApi = {
    val __obj = js.Dynamic.literal(fix_info = fix_info.asInstanceOf[js.Any], issue_id = issue_id.asInstanceOf[js.Any], pkg_name = pkg_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueOpenApi]
  }
  
  extension [Self <: IssueOpenApi](x: Self) {
    
    inline def setFix_info(value: FixInfoOpenApi): Self = StObject.set(x, "fix_info", value.asInstanceOf[js.Any])
    
    inline def setIssue_id(value: String): Self = StObject.set(x, "issue_id", value.asInstanceOf[js.Any])
    
    inline def setPkg_name(value: String): Self = StObject.set(x, "pkg_name", value.asInstanceOf[js.Any])
    
    inline def setPkg_version(value: String): Self = StObject.set(x, "pkg_version", value.asInstanceOf[js.Any])
    
    inline def setPkg_versionUndefined: Self = StObject.set(x, "pkg_version", js.undefined)
  }
}
