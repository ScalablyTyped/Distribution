package typings.protractor.anon

import typings.protractor.pluginsMod.SpecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedCount extends StObject {
  
  var failedCount: Double = js.native
  
  var specResults: js.Array[SpecResult] = js.native
}
object FailedCount {
  
  @scala.inline
  def apply(failedCount: Double, specResults: js.Array[SpecResult]): FailedCount = {
    val __obj = js.Dynamic.literal(failedCount = failedCount.asInstanceOf[js.Any], specResults = specResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCount]
  }
  
  @scala.inline
  implicit class FailedCountMutableBuilder[Self <: FailedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecResults(value: js.Array[SpecResult]): Self = StObject.set(x, "specResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecResultsVarargs(value: SpecResult*): Self = StObject.set(x, "specResults", js.Array(value :_*))
  }
}
