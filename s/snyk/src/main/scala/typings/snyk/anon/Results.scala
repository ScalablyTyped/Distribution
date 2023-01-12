package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PolicyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var results: js.Array[PolicyMetadata]
}
object Results {
  
  inline def apply(results: js.Array[PolicyMetadata]): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[PolicyMetadata]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: PolicyMetadata*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
