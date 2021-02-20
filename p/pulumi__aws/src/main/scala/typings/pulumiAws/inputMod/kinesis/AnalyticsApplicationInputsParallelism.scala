package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsParallelism extends StObject {
  
  /**
    * The Count of streams.
    */
  var count: js.UndefOr[Input[Double]] = js.native
}
object AnalyticsApplicationInputsParallelism {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsParallelism]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsParallelismMutableBuilder[Self <: AnalyticsApplicationInputsParallelism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
