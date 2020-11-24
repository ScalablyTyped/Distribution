package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Claim this structure to take control over the room. The controller structure
  * cannot be damaged or destroyed. It can be addressed by `Room.controller`
  * property.
  */
@js.native
trait StructureController
  extends OwnedStructure[STRUCTURE_CONTROLLER]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * Activate safe mode if available.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_TIRED
    */
  def activateSafeMode(): ScreepsReturnCode = js.native
  
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  var isPowerEnabled: Boolean = js.native
  
  /**
    * Current controller level, from 0 to 8.
    */
  var level: Double = js.native
  
  /**
    * The current progress of upgrading the controller to the next level.
    */
  var progress: Double = js.native
  
  /**
    * The progress needed to reach the next level.
    */
  var progressTotal: Double = js.native
  
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  var reservation: js.UndefOr[ReservationDefinition] = js.native
  
  /**
    * How many ticks of safe mode are remaining, or undefined.
    */
  var safeMode: js.UndefOr[Double] = js.native
  
  /**
    * Safe mode activations available to use.
    */
  var safeModeAvailable: Double = js.native
  
  /**
    * During this period in ticks new safe mode activations will be blocked, undefined if cooldown is inactive.
    */
  var safeModeCooldown: js.UndefOr[Double] = js.native
  
  /**
    * An object with the controller sign info if present
    */
  var sign: js.UndefOr[SignDefinition] = js.native
  
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  var ticksToDowngrade: Double = js.native
  
  /**
    * Make your claimed controller neutral again.
    */
  def unclaim(): ScreepsReturnCode = js.native
  
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  var upgradeBlocked: Double = js.native
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
    upgradeBlocked: Double
  ): StructureController = {
    val __obj = js.Dynamic.literal(activateSafeMode = js.Any.fromFunction0(activateSafeMode), destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isPowerEnabled = isPowerEnabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], safeModeAvailable = safeModeAvailable.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDowngrade = ticksToDowngrade.asInstanceOf[js.Any], unclaim = js.Any.fromFunction0(unclaim), upgradeBlocked = upgradeBlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureController]
  }
  
  @scala.inline
  implicit class StructureControllerOps[Self <: StructureController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivateSafeMode(value: () => ScreepsReturnCode): Self = this.set("activateSafeMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPowerEnabled(value: Boolean): Self = this.set("isPowerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTotal(value: Double): Self = this.set("progressTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeModeAvailable(value: Double): Self = this.set("safeModeAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksToDowngrade(value: Double): Self = this.set("ticksToDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclaim(value: () => ScreepsReturnCode): Self = this.set("unclaim", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpgradeBlocked(value: Double): Self = this.set("upgradeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservation(value: ReservationDefinition): Self = this.set("reservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservation: Self = this.set("reservation", js.undefined)
    
    @scala.inline
    def setSafeMode(value: Double): Self = this.set("safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeMode: Self = this.set("safeMode", js.undefined)
    
    @scala.inline
    def setSafeModeCooldown(value: Double): Self = this.set("safeModeCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeModeCooldown: Self = this.set("safeModeCooldown", js.undefined)
    
    @scala.inline
    def setSign(value: SignDefinition): Self = this.set("sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
  }
}
