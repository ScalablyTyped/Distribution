package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A destroyed structure. This is a walkable object.
  * <ul>
  *     <li>Decay: 500 ticks except some special cases</li>
  * </ul>
  */
trait Ruin extends RoomObject {
  /**
    * Time of destruction.
    */
  var destroyTime: Double
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  /**
    * An object with the ruin contents.
    */
  var store: StoreDefinitionUnlimited
  /**
    * An object containing the destroyed structure.
    */
  var structure: AnyStructure
  /**
    * The amount of game ticks before this ruin decays.
    */
  var ticksToDecay: Double
}

object Ruin {
  @scala.inline
  def apply(
    destroyTime: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Ruin],
    pos: RoomPosition,
    store: StoreDefinitionUnlimited,
    structure: AnyStructure,
    ticksToDecay: Double,
    room: Room = null
  ): Ruin = {
    val __obj = js.Dynamic.literal(destroyTime = destroyTime.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruin]
  }
}

