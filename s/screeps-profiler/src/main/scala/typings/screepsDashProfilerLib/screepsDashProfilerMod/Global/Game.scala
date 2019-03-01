package typings
package screepsDashProfilerLib.screepsDashProfilerMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * screeps-profiler extends the Game interface with itself
  * @see http://docs.screeps.com/api/#Game
  */
trait Game extends js.Object {
  var profiler: screepsDashProfilerLib.screepsDashProfilerMod.ScreepsGameProfiler
}

object Game {
  @scala.inline
  def apply(profiler: screepsDashProfilerLib.screepsDashProfilerMod.ScreepsGameProfiler): Game = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profiler")(profiler)
    __obj.asInstanceOf[Game]
  }
}

