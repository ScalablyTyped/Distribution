package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
  * @see http://docs.screeps.com/api/#Mineral
  */
trait Mineral[T /* <: MineralConstant */]
  extends StObject
     with RoomObject {
  
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  var density: Double
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type]
  
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: Double
  
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T
  
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: Double
}
object Mineral {
  
  inline def apply[T /* <: MineralConstant */](
    density: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Mineral[T]],
    mineralAmount: Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: Double
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mineralAmount = mineralAmount.asInstanceOf[js.Any], mineralType = mineralType.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToRegeneration = ticksToRegeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mineral[T]]
  }
  
  extension [Self <: Mineral[?], T /* <: MineralConstant */](x: Self & Mineral[T]) {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id[Mineral[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMineralAmount(value: Double): Self = StObject.set(x, "mineralAmount", value.asInstanceOf[js.Any])
    
    inline def setMineralType(value: T): Self = StObject.set(x, "mineralType", value.asInstanceOf[js.Any])
    
    inline def setTicksToRegeneration(value: Double): Self = StObject.set(x, "ticksToRegeneration", value.asInstanceOf[js.Any])
  }
}
