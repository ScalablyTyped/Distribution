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

object StructureController {
  @scala.inline
  def apply(
    activateSafeMode: () => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: () => scala.Boolean,
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
    val __obj = js.Dynamic.literal(activateSafeMode = js.Any.fromFunction0(activateSafeMode), destroy = js.Any.fromFunction0(destroy), hits = hits, hitsMax = hitsMax, id = id, isActive = js.Any.fromFunction0(isActive), level = level, my = my, notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner, pos = pos, progress = progress, progressTotal = progressTotal, room = room, safeModeAvailable = safeModeAvailable, structureType = structureType, ticksToDowngrade = ticksToDowngrade, unclaim = js.Any.fromFunction0(unclaim), upgradeBlocked = upgradeBlocked)
    if (reservation != null) __obj.updateDynamic("reservation")(reservation)
    if (safeMode != null) __obj.updateDynamic("safeMode")(safeMode.asInstanceOf[js.Any])
    if (safeModeCooldown != null) __obj.updateDynamic("safeModeCooldown")(safeModeCooldown.asInstanceOf[js.Any])
    if (sign != null) __obj.updateDynamic("sign")(sign)
    __obj.asInstanceOf[StructureController]
  }
}

