package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A remnant of dead creeps. This is a walkable structure.
  * <ul>
  *     <li>Decay: 5 ticks per body part of the deceased creep</li>
  * </ul>
  */
@js.native
trait Tombstone extends RoomObject {
  
  /**
    * An object containing the deceased creep.
    */
  var creep: AnyCreep = js.native
  
  /**
    * Time of death.
    */
  var deathTime: Double = js.native
  
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  
  /**
    * An object with the tombstone contents.
    * Each object key is one of the RESOURCE_* constants, values are resources amounts.
    * RESOURCE_ENERGY is always defined and equals to 0 when empty,
    * other resources are undefined when empty.
    * You can use lodash.sum to get the total amount of contents.
    */
  var store: StoreDefinitionUnlimited = js.native
  
  /**
    * The amount of game ticks before this tombstone decays.
    */
  var ticksToDecay: Double = js.native
}
object Tombstone {
  
  @scala.inline
  def apply(
    creep: AnyCreep,
    deathTime: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Tombstone],
    pos: RoomPosition,
    store: StoreDefinitionUnlimited,
    ticksToDecay: Double
  ): Tombstone = {
    val __obj = js.Dynamic.literal(creep = creep.asInstanceOf[js.Any], deathTime = deathTime.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tombstone]
  }
  
  @scala.inline
  implicit class TombstoneMutableBuilder[Self <: Tombstone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreep(value: AnyCreep): Self = StObject.set(x, "creep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeathTime(value: Double): Self = StObject.set(x, "deathTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Tombstone]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: StoreDefinitionUnlimited): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}
