package typings.reactDashPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded extends js.Object {
  var loaded: Double
  var loadedSeconds: Double
  var played: Double
  var playedSeconds: Double
}

object Anon_Loaded {
  @scala.inline
  def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): Anon_Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded, loadedSeconds = loadedSeconds, played = played, playedSeconds = playedSeconds)
  
    __obj.asInstanceOf[Anon_Loaded]
  }
}

