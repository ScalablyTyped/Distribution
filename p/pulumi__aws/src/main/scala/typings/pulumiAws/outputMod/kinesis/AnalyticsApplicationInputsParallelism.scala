package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsParallelism extends StObject {
  
  /**
    * The Count of streams.
    */
  var count: Double
}
object AnalyticsApplicationInputsParallelism {
  
  @scala.inline
  def apply(count: Double): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsParallelismMutableBuilder[Self <: AnalyticsApplicationInputsParallelism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
