package typings.screeps

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
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  var isPowerEnabled: Boolean
  /**
    * Current controller level, from 0 to 8.
    */
  var level: Double
  /**
    * The current progress of upgrading the controller to the next level.
    */
  var progress: Double
  /**
    * The progress needed to reach the next level.
    */
  var progressTotal: Double
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  var reservation: js.UndefOr[ReservationDefinition] = js.undefined
  /**
    * How many ticks of safe mode are remaining, or undefined.
    */
  var safeMode: js.UndefOr[Double] = js.undefined
  /**
    * Safe mode activations available to use.
    */
  var safeModeAvailable: Double
  /**
    * During this period in ticks new safe mode activations will be blocked, undefined if cooldown is inactive.
    */
  var safeModeCooldown: js.UndefOr[Double] = js.undefined
  /**
    * An object with the controller sign info if present
    */
  var sign: js.UndefOr[SignDefinition] = js.undefined
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  var ticksToDowngrade: Double
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  var upgradeBlocked: Double
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

object StructureController {
  @scala.inline
  def apply(
    activateSafeMode: () => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureController],
    isActive: () => Boolean,
    isPowerEnabled: Boolean,
    level: Double,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    room: Room,
    safeModeAvailable: Double,
    structureType: STRUCTURE_CONTROLLER,
    ticksToDowngrade: Double,
    unclaim: () => ScreepsReturnCode,
    upgradeBlocked: Double,
    owner: Owner = null,
    reservation: ReservationDefinition = null,
    safeMode: js.UndefOr[Double] = js.undefined,
    safeModeCooldown: js.UndefOr[Double] = js.undefined,
    sign: SignDefinition = null
  ): StructureController = {
    val __obj = js.Dynamic.literal(activateSafeMode = js.Any.fromFunction0(activateSafeMode), destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isPowerEnabled = isPowerEnabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], safeModeAvailable = safeModeAvailable.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDowngrade = ticksToDowngrade.asInstanceOf[js.Any], unclaim = js.Any.fromFunction0(unclaim), upgradeBlocked = upgradeBlocked.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (reservation != null) __obj.updateDynamic("reservation")(reservation.asInstanceOf[js.Any])
    if (!js.isUndefined(safeMode)) __obj.updateDynamic("safeMode")(safeMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safeModeCooldown)) __obj.updateDynamic("safeModeCooldown")(safeModeCooldown.get.asInstanceOf[js.Any])
    if (sign != null) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureController]
  }
}

