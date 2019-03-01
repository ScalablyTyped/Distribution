package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare type Spawn = StructureSpawn;
trait Spawning extends js.Object {
  /**
    * An array with the spawn directions
    * @see http://docs.screeps.com/api/#StructureSpawn.Spawning.setDirections
    */
  var directions: js.Array[DirectionConstant]
  /**
    * The name of the creep
    */
  var name: java.lang.String
  /**
    * Time needed in total to complete the spawning.
    */
  var needTime: scala.Double
  /**
    * Remaining time to go.
    */
  var remainingTime: scala.Double
  /**
    * A link to the spawn
    */
  var spawn: StructureSpawn
  /**
    * Cancel spawning immediately. Energy spent on spawning is not returned.
    */
  def cancel(): ScreepsReturnCode with (OK | ERR_NOT_OWNER)
  /**
    * Set desired directions where the creep should move when spawned.
    * @param directions An array with the spawn directions
    */
  def setDirections(directions: js.Array[DirectionConstant]): ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
}

object Spawning {
  @scala.inline
  def apply(
    cancel: js.Function0[ScreepsReturnCode with (OK | ERR_NOT_OWNER)],
    directions: js.Array[DirectionConstant],
    name: java.lang.String,
    needTime: scala.Double,
    remainingTime: scala.Double,
    setDirections: js.Function1[
      js.Array[DirectionConstant], 
      ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
    ],
    spawn: StructureSpawn
  ): Spawning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("directions")(directions)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("needTime")(needTime)
    __obj.updateDynamic("remainingTime")(remainingTime)
    __obj.updateDynamic("setDirections")(setDirections)
    __obj.updateDynamic("spawn")(spawn)
    __obj.asInstanceOf[Spawning]
  }
}

