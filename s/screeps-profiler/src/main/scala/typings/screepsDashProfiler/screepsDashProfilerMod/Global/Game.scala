package typings.screepsDashProfiler.screepsDashProfilerMod.Global

import typings.screepsDashProfiler.screepsDashProfilerMod.ScreepsGameProfiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * screeps-profiler extends the Game interface with itself
  * @see http://docs.screeps.com/api/#Game
  */
trait Game extends js.Object {
  var profiler: ScreepsGameProfiler
}

object Game {
  @scala.inline
  def apply(profiler: ScreepsGameProfiler): Game = {
    val __obj = js.Dynamic.literal(profiler = profiler)
  
    __obj.asInstanceOf[Game]
  }
}

