package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDepGraphResponse extends StObject {
  
  var meta: TestDepGraphMeta
  
  var result: TestDepGraphResult
}
object TestDepGraphResponse {
  
  inline def apply(meta: TestDepGraphMeta, result: TestDepGraphResult): TestDepGraphResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDepGraphResponse]
  }
  
  extension [Self <: TestDepGraphResponse](x: Self) {
    
    inline def setMeta(value: TestDepGraphMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TestDepGraphResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
