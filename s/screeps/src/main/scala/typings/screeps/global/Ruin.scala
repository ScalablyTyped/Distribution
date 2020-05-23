package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.AnyStructure
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.RuinConstructor
import typings.screeps.StoreDefinitionUnlimited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ruin")
@js.native
class Ruin protected ()
  extends typings.screeps.Ruin {
  def this(id: Id[typings.screeps.Ruin]) = this()
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
  override var pos: typings.screeps.RoomPosition = js.native
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

@JSGlobal("Ruin")
@js.native
object Ruin extends TopLevel[RuinConstructor]

