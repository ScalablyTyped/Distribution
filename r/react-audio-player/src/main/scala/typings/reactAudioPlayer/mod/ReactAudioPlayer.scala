package typings.reactAudioPlayer.mod

import typings.react.mod.Component
import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactAudioPlayer
  extends Component[ReactAudioPlayerProps, js.Any, js.Any] {
  var audioEl: HTMLAudioElement = js.native
  def clearListenTrack(): Unit = js.native
  def setListenTrack(): Unit = js.native
  def updateVolume(volume: Double): Unit = js.native
}

