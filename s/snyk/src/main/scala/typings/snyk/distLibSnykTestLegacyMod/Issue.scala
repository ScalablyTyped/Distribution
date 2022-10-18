package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issue extends StObject {
  
  var fixInfo: FixInfo
  
  var issueId: String
  
  var pkgName: String
  
  var pkgVersion: js.UndefOr[String] = js.undefined
}
object Issue {
  
  inline def apply(fixInfo: FixInfo, issueId: String, pkgName: String): Issue = {
    val __obj = js.Dynamic.literal(fixInfo = fixInfo.asInstanceOf[js.Any], issueId = issueId.asInstanceOf[js.Any], pkgName = pkgName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  
  extension [Self <: Issue](x: Self) {
    
    inline def setFixInfo(value: FixInfo): Self = StObject.set(x, "fixInfo", value.asInstanceOf[js.Any])
    
    inline def setIssueId(value: String): Self = StObject.set(x, "issueId", value.asInstanceOf[js.Any])
    
    inline def setPkgName(value: String): Self = StObject.set(x, "pkgName", value.asInstanceOf[js.Any])
    
    inline def setPkgVersion(value: String): Self = StObject.set(x, "pkgVersion", value.asInstanceOf[js.Any])
    
    inline def setPkgVersionUndefined: Self = StObject.set(x, "pkgVersion", js.undefined)
  }
}
