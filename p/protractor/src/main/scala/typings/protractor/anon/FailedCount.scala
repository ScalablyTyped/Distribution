package typings.protractor.anon

import typings.protractor.builtPluginsMod.SpecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCount extends StObject {
  
  var failedCount: Double
  
  var specResults: js.Array[SpecResult]
}
object FailedCount {
  
  inline def apply(failedCount: Double, specResults: js.Array[SpecResult]): FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCount]
  }
  
  extension [Self <: FailedCount](x: Self) {
    
    inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setSpecResults(value: js.Array[SpecResult]): Self = StObject.set(x, "specResults", value.asInstanceOf[js.Any])
    
    inline def setSpecResultsVarargs(value: SpecResult*): Self = StObject.set(x, "specResults", js.Array(value*))
  }
}
