package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactMeasure extends StObject {
  
  val batchUID: BatchUID
  
  val depth: Double
  
  val duration: Milliseconds
  
  val lanes: js.Array[ReactLane]
  
  val timestamp: Milliseconds
  
  val `type`: ReactMeasureType
}
object ReactMeasure {
  
  inline def apply(
    batchUID: BatchUID,
    depth: Double,
    duration: Milliseconds,
    lanes: js.Array[ReactLane],
    timestamp: Milliseconds,
    `type`: ReactMeasureType
  ): ReactMeasure = {
    val __obj = js.Dynamic.literal(batchUID = batchUID.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMeasure]
  }
  
  extension [Self <: ReactMeasure](x: Self) {
    
    inline def setBatchUID(value: BatchUID): Self = StObject.set(x, "batchUID", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLanes(value: js.Array[ReactLane]): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
    
    inline def setLanesVarargs(value: ReactLane*): Self = StObject.set(x, "lanes", js.Array(value*))
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReactMeasureType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
