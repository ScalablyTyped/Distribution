package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharpCounters extends StObject {
  
  /** The number of resize tasks currently being processed. */
  var process: Double
  
  /** The number of tasks this module has queued waiting for libuv to provide a worker thread from its pool. */
  var queue: Double
}
object SharpCounters {
  
  @scala.inline
  def apply(process: Double, queue: Double): SharpCounters = {
    val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharpCounters]
  }
  
  @scala.inline
  implicit class SharpCountersMutableBuilder[Self <: SharpCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcess(value: Double): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: Double): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
