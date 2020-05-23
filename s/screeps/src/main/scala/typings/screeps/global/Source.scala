package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.SourceConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Source")
@js.native
class Source protected ()
  extends typings.screeps.Source {
  def this(id: Id[typings.screeps.Source]) = this()
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
  override var id: Id[this.type] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typings.screeps.RoomPosition = js.native
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  override var room_Source: typings.screeps.Room = js.native
  /**
    * The remaining time after which the source will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: Double = js.native
}

@JSGlobal("Source")
@js.native
object Source extends TopLevel[SourceConstructor]

