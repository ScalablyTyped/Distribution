package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitDataFrontend extends StObject {
  
  /** Map of Fiber (ID) to a description of what changed in this commit. */
  var changeDescriptions: (Map[Double, ChangeDescription]) | Null
  
  /** How long was the render phase? */
  var duration: Double
  
  /**
    * How long was the layout commit phase?
    * Note that not all builds of React expose this property.
    */
  var effectDuration: Double | Null
  
  /**
    * Map of Fiber (ID) to actual duration for this commit;
    * Fibers that did not render will not have entries in this Map.
    */
  var fiberActualDurations: Map[Double, Double]
  
  /**
    * Map of Fiber (ID) to "self duration" for this commit;
    * Fibers that did not render will not have entries in this Map.
    */
  var fiberSelfDurations: Map[Double, Double]
  
  /**
    * How long was the passive commit phase?
    * Note that not all builds of React expose this property.
    */
  var passiveEffectDuration: Double | Null
  
  /** Priority level of the commit (if React provided this info) */
  var priorityLevel: String | Null
  
  /** When did this commit occur (relative to the start of profiling) */
  var timestamp: Double
  
  /** Fiber(s) responsible for scheduling this update. */
  var updaters: js.Array[SerializedElement] | Null
}
object CommitDataFrontend {
  
  inline def apply(
    duration: Double,
    fiberActualDurations: Map[Double, Double],
    fiberSelfDurations: Map[Double, Double],
    timestamp: Double
  ): CommitDataFrontend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fiberActualDurations = fiberActualDurations.asInstanceOf[js.Any], fiberSelfDurations = fiberSelfDurations.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], changeDescriptions = null, effectDuration = null, passiveEffectDuration = null, priorityLevel = null, updaters = null)
    __obj.asInstanceOf[CommitDataFrontend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitDataFrontend] (val x: Self) extends AnyVal {
    
    inline def setChangeDescriptions(value: Map[Double, ChangeDescription]): Self = StObject.set(x, "changeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionsNull: Self = StObject.set(x, "changeDescriptions", null)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffectDuration(value: Double): Self = StObject.set(x, "effectDuration", value.asInstanceOf[js.Any])
    
    inline def setEffectDurationNull: Self = StObject.set(x, "effectDuration", null)
    
    inline def setFiberActualDurations(value: Map[Double, Double]): Self = StObject.set(x, "fiberActualDurations", value.asInstanceOf[js.Any])
    
    inline def setFiberSelfDurations(value: Map[Double, Double]): Self = StObject.set(x, "fiberSelfDurations", value.asInstanceOf[js.Any])
    
    inline def setPassiveEffectDuration(value: Double): Self = StObject.set(x, "passiveEffectDuration", value.asInstanceOf[js.Any])
    
    inline def setPassiveEffectDurationNull: Self = StObject.set(x, "passiveEffectDuration", null)
    
    inline def setPriorityLevel(value: String): Self = StObject.set(x, "priorityLevel", value.asInstanceOf[js.Any])
    
    inline def setPriorityLevelNull: Self = StObject.set(x, "priorityLevel", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdaters(value: js.Array[SerializedElement]): Self = StObject.set(x, "updaters", value.asInstanceOf[js.Any])
    
    inline def setUpdatersNull: Self = StObject.set(x, "updaters", null)
    
    inline def setUpdatersVarargs(value: SerializedElement*): Self = StObject.set(x, "updaters", js.Array(value*))
  }
}
