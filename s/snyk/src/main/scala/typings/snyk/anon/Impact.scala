package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impact extends StObject {
  
  var impact: String
  
  var issue: String
  
  var resolve: String
}
object Impact {
  
  inline def apply(impact: String, issue: String, resolve: String): Impact = {
    val __obj = js.Dynamic.literal(impact = impact.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Impact] (val x: Self) extends AnyVal {
    
    inline def setImpact(value: String): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
