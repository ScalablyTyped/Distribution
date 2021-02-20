package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
  */
@js.native
trait EventSeries extends StObject {
  
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  var count: Double = js.native
  
  /**
    * Time of the last occurrence observed
    */
  var lastObservedTime: String = js.native
  
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  var state: String = js.native
}
object EventSeries {
  
  @scala.inline
  def apply(count: Double, lastObservedTime: String, state: String): EventSeries = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSeries]
  }
  
  @scala.inline
  implicit class EventSeriesMutableBuilder[Self <: EventSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastObservedTime(value: String): Self = StObject.set(x, "lastObservedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
