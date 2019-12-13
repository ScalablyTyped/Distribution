package typings.screeps

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("Ruin")
@js.native
object Ruin extends TopLevel[RuinConstructor]

