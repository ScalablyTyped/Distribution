package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Deposit")
@js.native
class DepositCls protected () extends Deposit {
  def this(id: Id[Deposit]) = this()
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  /* CompleteClass */
  override var cooldown: Double = js.native
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  /* CompleteClass */
  override var depositType: DepositConstant = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * The cooldown of the last harvest operation on this deposit.
    */
  /* CompleteClass */
  override var lastCooldown: Double = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The amount of game ticks when this deposit will disappear.
    */
  /* CompleteClass */
  override var ticksToDecay: Double = js.native
}

