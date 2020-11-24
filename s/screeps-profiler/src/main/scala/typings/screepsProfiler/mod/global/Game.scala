package typings.screepsProfiler.mod.global

import org.scalablytyped.runtime.TopLevel
import typings.screepsProfiler.mod.ScreepsGameProfiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * screeps-profiler extends the Game interface with itself
  * @see http://docs.screeps.com/api/#Game
  */
@js.native
trait Game extends js.Object {
  
  var profiler: ScreepsGameProfiler = js.native
}
@JSGlobal("Game")
@js.native
object Game extends TopLevel[Game]
