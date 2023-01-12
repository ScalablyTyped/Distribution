package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies scheduling options for a recurring Dispatch job.
  */
trait JobOptions extends StObject {
  
  /**
    * `true` if the job should be treated as a background process. If the only jobs in the event
    * loop are background jobs at the end of a frame, the engine will shut down as if it were
    * empty.
    * @default false
    */
  var inBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Job priority. Priority can be positive, negative, or even fractional. Higher priority jobs
    * are updated earlier and rendered later, allowing the game to control the order in which
    * things are scheduled within a frame.
    * @default 0.0
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object JobOptions {
  
  inline def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOptions] (val x: Self) extends AnyVal {
    
    inline def setInBackground(value: Boolean): Self = StObject.set(x, "inBackground", value.asInstanceOf[js.Any])
    
    inline def setInBackgroundUndefined: Self = StObject.set(x, "inBackground", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
