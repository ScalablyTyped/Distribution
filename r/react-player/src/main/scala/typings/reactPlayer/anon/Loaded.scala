package typings.reactPlayer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loaded extends js.Object {
  var loaded: Double
  var loadedSeconds: Double
  var played: Double
  var playedSeconds: Double
}

object Loaded {
  @scala.inline
  def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
}

