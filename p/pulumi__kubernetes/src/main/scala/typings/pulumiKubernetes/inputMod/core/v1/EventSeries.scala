package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
  */
trait EventSeries extends StObject {
  
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Time of the last occurrence observed
    */
  var lastObservedTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  var state: js.UndefOr[Input[String]] = js.undefined
}
object EventSeries {
  
  inline def apply(): EventSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSeries]
  }
  
  extension [Self <: EventSeries](x: Self) {
    
    inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLastObservedTime(value: Input[String]): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
    
    inline def setLastObservedTimeUndefined: Self = StObject.set(x, "lastObservedTime", js.undefined)
    
    inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
