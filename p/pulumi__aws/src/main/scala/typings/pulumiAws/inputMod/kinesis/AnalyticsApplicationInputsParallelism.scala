package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsParallelism extends StObject {
  
  /**
    * The Count of streams.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
}
object AnalyticsApplicationInputsParallelism {
  
  inline def apply(): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
  
  extension [Self <: AnalyticsApplicationInputsParallelism](x: Self) {
    
    inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
