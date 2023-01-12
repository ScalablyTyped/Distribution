package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitDataBackend extends StObject {
  
  /** Tuple of fiber ID and change description */
  var changeDescriptions: (js.Array[js.Tuple2[Double, ChangeDescription]]) | Null
  
  var duration: Double
  
  /** Only available in certain (newer) React builds, */
  var effectDuration: Double | Null
  
  /** Tuple of fiber ID and actual duration */
  var fiberActualDurations: js.Array[js.Tuple2[Double, Double]]
  
  /** Tuple of fiber ID and computed "self" duration */
  var fiberSelfDurations: js.Array[js.Tuple2[Double, Double]]
  
  /** Only available in certain (newer) React builds, */
  var passiveEffectDuration: Double | Null
  
  var priorityLevel: String | Null
  
  var timestamp: Double
  
  var updaters: js.Array[SerializedElement] | Null
}
object CommitDataBackend {
  
  inline def apply(
    duration: Double,
    fiberActualDurations: js.Array[js.Tuple2[Double, Double]],
    fiberSelfDurations: js.Array[js.Tuple2[Double, Double]],
    timestamp: Double
  ): CommitDataBackend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fiberActualDurations = fiberActualDurations.asInstanceOf[js.Any], fiberSelfDurations = fiberSelfDurations.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], changeDescriptions = null, effectDuration = null, passiveEffectDuration = null, priorityLevel = null, updaters = null)
    __obj.asInstanceOf[CommitDataBackend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitDataBackend] (val x: Self) extends AnyVal {
    
    inline def setChangeDescriptions(value: js.Array[js.Tuple2[Double, ChangeDescription]]): Self = StObject.set(x, "changeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionsNull: Self = StObject.set(x, "changeDescriptions", null)
    
    inline def setChangeDescriptionsVarargs(value: (js.Tuple2[Double, ChangeDescription])*): Self = StObject.set(x, "changeDescriptions", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffectDuration(value: Double): Self = StObject.set(x, "effectDuration", value.asInstanceOf[js.Any])
    
    inline def setEffectDurationNull: Self = StObject.set(x, "effectDuration", null)
    
    inline def setFiberActualDurations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fiberActualDurations", value.asInstanceOf[js.Any])
    
    inline def setFiberActualDurationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "fiberActualDurations", js.Array(value*))
    
    inline def setFiberSelfDurations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "fiberSelfDurations", value.asInstanceOf[js.Any])
    
    inline def setFiberSelfDurationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "fiberSelfDurations", js.Array(value*))
    
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
