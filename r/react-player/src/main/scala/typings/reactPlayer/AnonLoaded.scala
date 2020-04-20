package typings.reactPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var loaded: Double
  var loadedSeconds: Double
  var played: Double
  var playedSeconds: Double
}

object AnonLoaded {
  @scala.inline
  def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoaded]
  }
}

