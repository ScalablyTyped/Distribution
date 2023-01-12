package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An energy source object. Can be harvested by creeps with a WORK body part.
  */
trait Source
  extends StObject
     with RoomObject {
  
  /**
    * The remaining amount of energy.
    */
  var energy: Double
  
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  var energyCapacity: Double
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  @JSName("room")
  var room_Source: Room
  
  /**
    * The remaining time after which the source will be refilled.
    */
  var ticksToRegeneration: Double
}
object Source {
  
  inline def apply(
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    id: Id[Source],
    pos: RoomPosition,
    room: Room,
    ticksToRegeneration: Double
  ): Source = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], ticksToRegeneration = ticksToRegeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyCapacity(value: Double): Self = StObject.set(x, "energyCapacity", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id[Source]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: Room): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setTicksToRegeneration(value: Double): Self = StObject.set(x, "ticksToRegeneration", value.asInstanceOf[js.Any])
  }
}
