package typings.screeps

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("StructureController")
@js.native
object StructureController extends TopLevel[StructureControllerConstructor]

