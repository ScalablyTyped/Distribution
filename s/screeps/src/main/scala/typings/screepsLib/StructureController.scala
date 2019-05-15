package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Claim this structure to take control over the room. The controller structure
  * cannot be damaged or destroyed. It can be addressed by `Room.controller`
  * property.
  */
trait StructureController
  extends OwnedStructure[STRUCTURE_CONTROLLER]
     with AnyOwnedStructure {
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  var isPowerEnabled: scala.Boolean
  /**
    * Current controller level, from 0 to 8.
    */
  var level: scala.Double
  /**
    * The current progress of upgrading the controller to the next level.
    */
  var progress: scala.Double
  /**
    * The progress needed to reach the next level.
    */
  var progressTotal: scala.Double
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  var reservation: js.UndefOr[ReservationDefinition]
  /**
    * How many ticks of safe mode are remaining, or undefined.
    */
  var safeMode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Safe mode activations available to use.
    */
  var safeModeAvailable: scala.Double
  /**
    * During this period in ticks new safe mode activations will be blocked, undefined if cooldown is inactive.
    */
  var safeModeCooldown: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object with the controller sign info if present
    */
  var sign: js.UndefOr[SignDefinition]
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  var ticksToDowngrade: scala.Double
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  var upgradeBlocked: scala.Double
  /**
    * Activate safe mode if available.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_TIRED
    */
  def activateSafeMode(): ScreepsReturnCode
  /**
    * Make your claimed controller neutral again.
    */
  def unclaim(): ScreepsReturnCode
}

@JSGlobal("StructureController")
@js.native
class StructureControllerCls protected () extends StructureController {
  def this(id: java.lang.String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hits: scala.Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  override var hitsMax: scala.Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  /* CompleteClass */
  override var isPowerEnabled: scala.Boolean = js.native
  /**
    * Current controller level, from 0 to 8.
    */
  /* CompleteClass */
  override var level: scala.Double = js.native
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  override var my: scala.Boolean = js.native
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  /* CompleteClass */
  override var owner: Owner = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The current progress of upgrading the controller to the next level.
    */
  /* CompleteClass */
  override var progress: scala.Double = js.native
  /**
    * The progress needed to reach the next level.
    */
  /* CompleteClass */
  override var progressTotal: scala.Double = js.native
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  /* CompleteClass */
  override var reservation: js.UndefOr[ReservationDefinition] = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Structure: Room = js.native
  /**
    * Safe mode activations available to use.
    */
  /* CompleteClass */
  override var safeModeAvailable: scala.Double = js.native
  /**
    * An object with the controller sign info if present
    */
  /* CompleteClass */
  override var sign: js.UndefOr[SignDefinition] = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  override var structureType: STRUCTURE_CONTROLLER = js.native
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  /* CompleteClass */
  override var ticksToDowngrade: scala.Double = js.native
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  /* CompleteClass */
  override var upgradeBlocked: scala.Double = js.native
  /**
    * Activate safe mode if available.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_TIRED
    */
  /* CompleteClass */
  override def activateSafeMode(): ScreepsReturnCode = js.native
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): scala.Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: scala.Boolean): ScreepsReturnCode = js.native
  /**
    * Make your claimed controller neutral again.
    */
  /* CompleteClass */
  override def unclaim(): ScreepsReturnCode = js.native
}

object StructureController {
  @scala.inline
  def apply(
    activateSafeMode: () => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
    isPowerEnabled: scala.Boolean,
    level: scala.Double,
    my: scala.Boolean,
    notifyWhenAttacked: scala.Boolean => ScreepsReturnCode,
    owner: Owner,
    pos: RoomPosition,
    progress: scala.Double,
    progressTotal: scala.Double,
    room: Room,
    safeModeAvailable: scala.Double,
    structureType: STRUCTURE_CONTROLLER,
    ticksToDowngrade: scala.Double,
    unclaim: () => ScreepsReturnCode,
    upgradeBlocked: scala.Double,
    reservation: ReservationDefinition = null,
    safeMode: scala.Int | scala.Double = null,
    safeModeCooldown: scala.Int | scala.Double = null,
    sign: SignDefinition = null
  ): StructureController = {
    val __obj = js.Dynamic.literal(activateSafeMode = js.Any.fromFunction0(activateSafeMode), destroy = js.Any.fromFunction0(destroy), effects = effects, hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), isPowerEnabled = isPowerEnabled, level = level, my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, progress = progress, progressTotal = progressTotal, room = room, safeModeAvailable = safeModeAvailable, structureType = structureType, ticksToDowngrade = ticksToDowngrade, unclaim = js.Any.fromFunction0(unclaim), upgradeBlocked = upgradeBlocked)
    if (reservation != null) __obj.updateDynamic("reservation")(reservation)
    if (safeMode != null) __obj.updateDynamic("safeMode")(safeMode.asInstanceOf[js.Any])
    if (safeModeCooldown != null) __obj.updateDynamic("safeModeCooldown")(safeModeCooldown.asInstanceOf[js.Any])
    if (sign != null) __obj.updateDynamic("sign")(sign)
    __obj.asInstanceOf[StructureController]
  }
}

