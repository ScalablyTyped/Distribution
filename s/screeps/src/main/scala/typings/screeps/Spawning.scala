package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare type Spawn = StructureSpawn;
@js.native
trait Spawning extends js.Object {
  /**
    * An array with the spawn directions
    * @see http://docs.screeps.com/api/#StructureSpawn.Spawning.setDirections
    */
  var directions: js.Array[DirectionConstant] = js.native
  /**
    * The name of the creep
    */
  var name: String = js.native
  /**
    * Time needed in total to complete the spawning.
    */
  var needTime: Double = js.native
  /**
    * Remaining time to go.
    */
  var remainingTime: Double = js.native
  /**
    * A link to the spawn
    */
  var spawn: StructureSpawn = js.native
  /**
    * Cancel spawning immediately. Energy spent on spawning is not returned.
    */
  def cancel(): ScreepsReturnCode with (OK | ERR_NOT_OWNER) = js.native
  /**
    * Set desired directions where the creep should move when spawned.
    * @param directions An array with the spawn directions
    */
  def setDirections(directions: js.Array[DirectionConstant]): ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS) = js.native
}

object Spawning {
  @scala.inline
  def apply(
    cancel: () => ScreepsReturnCode with (OK | ERR_NOT_OWNER),
    directions: js.Array[DirectionConstant],
    name: String,
    needTime: Double,
    remainingTime: Double,
    setDirections: js.Array[DirectionConstant] => ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS),
    spawn: StructureSpawn
  ): Spawning = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), directions = directions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needTime = needTime.asInstanceOf[js.Any], remainingTime = remainingTime.asInstanceOf[js.Any], setDirections = js.Any.fromFunction1(setDirections), spawn = spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spawning]
  }
  @scala.inline
  implicit class SpawningOps[Self <: Spawning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => ScreepsReturnCode with (OK | ERR_NOT_OWNER)): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setDirectionsVarargs(value: DirectionConstant*): Self = this.set("directions", js.Array(value :_*))
    @scala.inline
    def setDirections(value: js.Array[DirectionConstant]): Self = this.set("directions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedTime(value: Double): Self = this.set("needTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainingTime(value: Double): Self = this.set("remainingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDirections(
      value: js.Array[DirectionConstant] => ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
    ): Self = this.set("setDirections", js.Any.fromFunction1(value))
    @scala.inline
    def setSpawn(value: StructureSpawn): Self = this.set("spawn", value.asInstanceOf[js.Any])
  }
  
}

