package typings
package reactDashPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded extends js.Object {
  var loaded: scala.Double
  var loadedSeconds: scala.Double
  var played: scala.Double
  var playedSeconds: scala.Double
}

object Anon_Loaded {
  @scala.inline
  def apply(
    loaded: scala.Double,
    loadedSeconds: scala.Double,
    played: scala.Double,
    playedSeconds: scala.Double
  ): Anon_Loaded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("loadedSeconds")(loadedSeconds)
    __obj.updateDynamic("played")(played)
    __obj.updateDynamic("playedSeconds")(playedSeconds)
    __obj.asInstanceOf[Anon_Loaded]
  }
}

