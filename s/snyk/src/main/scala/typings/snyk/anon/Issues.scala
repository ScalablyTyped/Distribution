package typings.snyk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibSnykTestLegacyMod.Issue
import typings.snyk.distLibSnykTestLegacyMod.Pkg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issues extends StObject {
  
  var issues: StringDictionary[Issue]
  
  var pkg: Pkg
}
object Issues {
  
  inline def apply(issues: StringDictionary[Issue], pkg: Pkg): Issues = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issues] (val x: Self) extends AnyVal {
    
    inline def setIssues(value: StringDictionary[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setPkg(value: Pkg): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
  }
}
