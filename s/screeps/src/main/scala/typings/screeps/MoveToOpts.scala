package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToOpts
  extends StObject
     with FindPathOpts {
  
  /**
    * If this option is set to true, `moveTo` method will return `ERR_NOT_FOUND` if there is no memorized path to reuse. This can
    * significantly save CPU time in some cases. The default value is false.
    */
  var noPathFinding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option enables reusing the path found along multiple game ticks. It allows to save CPU time, but can result in a slightly
    * slower creep reaction behavior. The path is stored into the creep's memory to the `_move` property. The `reusePath` value defines
    * the amount of ticks which the path should be reused for. The default value is 5. Increase the amount to save more CPU, decrease
    * to make the movement more consistent. Set to 0 if you want to disable path reusing.
    */
  var reusePath: js.UndefOr[Double] = js.undefined
  
  /**
    * If `reusePath` is enabled and this option is set to true, the path will be stored in memory in the short serialized form using
    * `Room.serializePath`. The default value is true.
    */
  var serializeMemory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Draw a line along the creep’s path using `RoomVisual.poly`. You can provide either an empty object or custom style parameters.
    */
  var visualizePathStyle: js.UndefOr[PolyStyle] = js.undefined
}
object MoveToOpts {
  
  inline def apply(): MoveToOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOpts]
  }
  
  extension [Self <: MoveToOpts](x: Self) {
    
    inline def setNoPathFinding(value: Boolean): Self = StObject.set(x, "noPathFinding", value.asInstanceOf[js.Any])
    
    inline def setNoPathFindingUndefined: Self = StObject.set(x, "noPathFinding", js.undefined)
    
    inline def setReusePath(value: Double): Self = StObject.set(x, "reusePath", value.asInstanceOf[js.Any])
    
    inline def setReusePathUndefined: Self = StObject.set(x, "reusePath", js.undefined)
    
    inline def setSerializeMemory(value: Boolean): Self = StObject.set(x, "serializeMemory", value.asInstanceOf[js.Any])
    
    inline def setSerializeMemoryUndefined: Self = StObject.set(x, "serializeMemory", js.undefined)
    
    inline def setVisualizePathStyle(value: PolyStyle): Self = StObject.set(x, "visualizePathStyle", value.asInstanceOf[js.Any])
    
    inline def setVisualizePathStyleUndefined: Self = StObject.set(x, "visualizePathStyle", js.undefined)
  }
}
