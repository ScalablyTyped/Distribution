package typings.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rare resource deposit needed for producing commodities.
  * Can be harvested by creeps with a WORK body part.
  * Each harvest operation triggers a cooldown period, which becomes longer and longer over time.
  */
trait Deposit extends RoomObject {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var depositType: DepositConstant
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  /**
    * The cooldown of the last harvest operation on this deposit.
    */
  var lastCooldown: Double
  /**
    * The amount of game ticks when this deposit will disappear.
    */
  var ticksToDecay: Double
}

@JSGlobal("Deposit")
@js.native
object Deposit extends TopLevel[DepositConstructor]

