package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ruin")
@js.native
class RuinCls protected () extends Ruin {
  def this(id: Id[Ruin]) = this()
  /**
    * Time of destruction.
    */
  /* CompleteClass */
  override var destroyTime: Double = js.native
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
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * An object with the ruin contents.
    */
  /* CompleteClass */
  override var store: StoreDefinitionUnlimited = js.native
  /**
    * An object containing the destroyed structure.
    */
  /* CompleteClass */
  override var structure: AnyStructure = js.native
  /**
    * The amount of game ticks before this ruin decays.
    */
  /* CompleteClass */
  override var ticksToDecay: Double = js.native
}

