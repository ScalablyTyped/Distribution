package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.ScreepsReturnCode
import typings.screeps.StructureInvaderCoreConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StructureInvaderCore")
@js.native
class StructureInvaderCore protected ()
  extends typings.screeps.StructureInvaderCore {
  def this(id: Id[typings.screeps.StructureInvaderCore]) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * The level of the stronghold. The amount and quality of the loot depends on the level.
    */
  /* CompleteClass */
  override var level: Double = js.native
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: Boolean = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typings.screeps.RoomPosition = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: typings.screeps.Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: typings.screeps.STRUCTURE_INVADER_CORE = js.native
  /**
    * Shows the timer for a not yet deployed stronghold, undefined otherwise.
    */
  /* CompleteClass */
  override var ticksToDeploy: Double = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
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
}

@JSGlobal("StructureInvaderCore")
@js.native
object StructureInvaderCore extends TopLevel[StructureInvaderCoreConstructor]

