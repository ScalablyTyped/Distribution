package typings.rdfjsTypes.queryCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOperationCost
  extends StObject
     with /**
  * Custom properties
  */
/* key */ StringDictionary[Any] {
  
  /**
    * An estimation of how many items block the stream.
    * This is used to determine the time the stream is not progressing anymore.
    */
  var blockingItems: Double
  
  /**
    * An estimation of how many iterations over items are executed.
    * This is used to determine the CPU cost.
    */
  var iterations: Double
  
  /**
    * An estimation of how many items are stored in memory.
    * This is used to determine the memory cost.
    */
  var persistedItems: Double
  
  /**
    * An estimation of the time to request items from sources.
    * This is used to determine the I/O cost.
    */
  var requestTime: Double
}
object QueryOperationCost {
  
  inline def apply(blockingItems: Double, iterations: Double, persistedItems: Double, requestTime: Double): QueryOperationCost = {
    val __obj = js.Dynamic.literal(blockingItems = blockingItems.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], persistedItems = persistedItems.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOperationCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOperationCost] (val x: Self) extends AnyVal {
    
    inline def setBlockingItems(value: Double): Self = StObject.set(x, "blockingItems", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setPersistedItems(value: Double): Self = StObject.set(x, "persistedItems", value.asInstanceOf[js.Any])
    
    inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
  }
}
