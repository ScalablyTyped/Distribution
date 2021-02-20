package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parent object for structure classes
  */
@js.native
trait Structure[T /* <: StructureConstant */] extends RoomObject {
  
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode = js.native
  
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double = js.native
  
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double = js.native
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): Boolean = js.native
  
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
  
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room = js.native
  
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T = js.native
}
object Structure {
  
  @scala.inline
  def apply[T /* <: StructureConstant */](
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[Structure[T]],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure[T]]
  }
  
  @scala.inline
  implicit class StructureMutableBuilder[Self <: Structure[_], T /* <: StructureConstant */] (val x: Self with Structure[T]) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => ScreepsReturnCode): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsMax(value: Double): Self = StObject.set(x, "hitsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Structure[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyWhenAttacked(value: Boolean => ScreepsReturnCode): Self = StObject.set(x, "notifyWhenAttacked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoom(value: Room): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureType(value: T): Self = StObject.set(x, "structureType", value.asInstanceOf[js.Any])
  }
}
