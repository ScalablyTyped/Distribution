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
    activateSafeMode: js.Function0[ScreepsReturnCode],
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    level: scala.Double,
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    progress: scala.Double,
    progressTotal: scala.Double,
    room: Room,
    safeModeAvailable: scala.Double,
    structureType: STRUCTURE_CONTROLLER,
    ticksToDowngrade: scala.Double,
    unclaim: js.Function0[ScreepsReturnCode],
    upgradeBlocked: scala.Double,
    reservation: ReservationDefinition = null,
    safeMode: scala.Int | scala.Double = null,
    safeModeCooldown: scala.Int | scala.Double = null,
    sign: SignDefinition = null
  ): StructureController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateSafeMode")(activateSafeMode)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("my")(my)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("progressTotal")(progressTotal)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("safeModeAvailable")(safeModeAvailable)
    __obj.updateDynamic("structureType")(structureType)
    __obj.updateDynamic("ticksToDowngrade")(ticksToDowngrade)
    __obj.updateDynamic("unclaim")(unclaim)
    __obj.updateDynamic("upgradeBlocked")(upgradeBlocked)
    if (reservation != null) __obj.updateDynamic("reservation")(reservation)
    if (safeMode != null) __obj.updateDynamic("safeMode")(safeMode.asInstanceOf[js.Any])
    if (safeModeCooldown != null) __obj.updateDynamic("safeModeCooldown")(safeModeCooldown.asInstanceOf[js.Any])
    if (sign != null) __obj.updateDynamic("sign")(sign)
    __obj.asInstanceOf[StructureController]
  }
}

