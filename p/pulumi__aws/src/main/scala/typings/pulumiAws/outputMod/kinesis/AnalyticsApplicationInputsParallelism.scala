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
  
  inline def apply(count: Double): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
  
  extension [Self <: AnalyticsApplicationInputsParallelism](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
