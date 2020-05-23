package typings.screeps

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

object Deposit {
  @scala.inline
  def apply(
    cooldown: Double,
    depositType: DepositConstant,
    effects: js.Array[RoomObjectEffect],
    id: Id[Deposit],
    lastCooldown: Double,
    pos: RoomPosition,
    ticksToDecay: Double,
    room: Room = null
  ): Deposit = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], depositType = depositType.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastCooldown = lastCooldown.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deposit]
  }
}

