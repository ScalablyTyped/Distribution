package typings.screepsProfiler.mod._Global_

import org.scalablytyped.runtime.TopLevel
import typings.screepsProfiler.mod.ScreepsGameProfiler
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

@JSGlobal("Game")
@js.native
object Game extends TopLevel[Game]

