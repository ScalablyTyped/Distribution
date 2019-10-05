package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Source")
@js.native
class SourceCls protected () extends Source {
  def this(id: String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * The remaining amount of energy.
    */
  /* CompleteClass */
  override var energy: Double = js.native
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  /* CompleteClass */
  override var energyCapacity: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Source: Room = js.native
  /**
    * The remaining time after which the source will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: Double = js.native
}

