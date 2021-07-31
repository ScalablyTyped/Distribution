package typings.screeps.global

import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.ScreepsReturnCode
import typings.screeps.StructureWallConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StructureWall")
@js.native
class StructureWall protected ()
  extends StObject
     with typings.screeps.StructureWall {
  def this(id: Id[typings.screeps.StructureWall]) = this()
  
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  var hits: Double = js.native
  
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  var hitsMax: Double = js.native
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  var room_Structure: typings.screeps.Room = js.native
  
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  var structureType: typings.screeps.STRUCTURE_WALL = js.native
  
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  /* CompleteClass */
  var ticksToLive: Double = js.native
}
object StructureWall {
  
  @scala.inline
  def apply: StructureWallConstructor = js.Dynamic.global.selectDynamic("StructureWall").asInstanceOf[StructureWallConstructor]
}
