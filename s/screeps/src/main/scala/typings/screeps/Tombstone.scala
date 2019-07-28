package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A remnant of dead creeps. This is a walkable structure.
  * <ul>
  *     <li>Decay: 5 ticks per body part of the deceased creep</li>
  * </ul>
  */
trait Tombstone extends RoomObject {
  /**
    * An object containing the deceased creep.
    */
  var creep: AnyCreep
  /**
    * Time of death.
    */
  var deathTime: Double
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: String
  /**
    * An object with the tombstone contents.
    * Each object key is one of the RESOURCE_* constants, values are resources amounts.
    * RESOURCE_ENERGY is always defined and equals to 0 when empty,
    * other resources are undefined when empty.
    * You can use lodash.sum to get the total amount of contents.
    */
  var store: StoreDefinition
  /**
    * The amount of game ticks before this tombstone decays.
    */
  var ticksToDecay: Double
}

@JSGlobal("Tombstone")
@js.native
class TombstoneCls protected () extends Tombstone {
  def this(id: String) = this()
  /**
    * An object containing the deceased creep.
    */
  /* CompleteClass */
  override var creep: AnyCreep = js.native
  /**
    * Time of death.
    */
  /* CompleteClass */
  override var deathTime: Double = js.native
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
  override var id: String = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * An object with the tombstone contents.
    * Each object key is one of the RESOURCE_* constants, values are resources amounts.
    * RESOURCE_ENERGY is always defined and equals to 0 when empty,
    * other resources are undefined when empty.
    * You can use lodash.sum to get the total amount of contents.
    */
  /* CompleteClass */
  override var store: StoreDefinition = js.native
  /**
    * The amount of game ticks before this tombstone decays.
    */
  /* CompleteClass */
  override var ticksToDecay: Double = js.native
}

object Tombstone {
  @scala.inline
  def apply(
    creep: AnyCreep,
    deathTime: Double,
    effects: js.Array[RoomObjectEffect],
    id: String,
    pos: RoomPosition,
    store: StoreDefinition,
    ticksToDecay: Double,
    room: Room = null
  ): Tombstone = {
    val __obj = js.Dynamic.literal(creep = creep, deathTime = deathTime, effects = effects, id = id, pos = pos, store = store, ticksToDecay = ticksToDecay)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Tombstone]
  }
}

