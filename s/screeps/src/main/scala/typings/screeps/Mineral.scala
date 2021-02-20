package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
  * @see http://docs.screeps.com/api/#Mineral
  */
@js.native
trait Mineral[T /* <: MineralConstant */] extends RoomObject {
  
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  var density: Double = js.native
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: Double = js.native
  
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T = js.native
  
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: Double = js.native
}
object Mineral {
  
  @scala.inline
  def apply[T /* <: MineralConstant */](
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
  
  @scala.inline
  implicit class MineralMutableBuilder[Self <: Mineral[_], T /* <: MineralConstant */] (val x: Self with Mineral[T]) extends AnyVal {
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Mineral[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineralAmount(value: Double): Self = StObject.set(x, "mineralAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineralType(value: T): Self = StObject.set(x, "mineralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksToRegeneration(value: Double): Self = StObject.set(x, "ticksToRegeneration", value.asInstanceOf[js.Any])
  }
}
