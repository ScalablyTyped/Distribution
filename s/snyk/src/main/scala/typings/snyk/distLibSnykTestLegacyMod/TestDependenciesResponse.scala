package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDependenciesResponse extends StObject {
  
  var meta: TestDepGraphMeta
  
  var result: TestDependenciesResult
}
object TestDependenciesResponse {
  
  inline def apply(meta: TestDepGraphMeta, result: TestDependenciesResult): TestDependenciesResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDependenciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestDependenciesResponse] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: TestDepGraphMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TestDependenciesResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
