package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.IacFileInDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReturnValue extends StObject {
  
  var failures: js.UndefOr[js.Array[IacFileInDirectory]] = js.undefined
  
  var ignoreCount: Double
  
  var results: TestResult | js.Array[TestResult]
}
object TestReturnValue {
  
  inline def apply(ignoreCount: Double, results: TestResult | js.Array[TestResult]): TestReturnValue = {
    val __obj = js.Dynamic.literal(ignoreCount = ignoreCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReturnValue]
  }
  
  extension [Self <: TestReturnValue](x: Self) {
    
    inline def setFailures(value: js.Array[IacFileInDirectory]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: IacFileInDirectory*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setIgnoreCount(value: Double): Self = StObject.set(x, "ignoreCount", value.asInstanceOf[js.Any])
    
    inline def setResults(value: TestResult | js.Array[TestResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: TestResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
