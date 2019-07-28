package typings.reactDashNativeDashVideo.reactDashNativeDashVideoMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video
  extends Component[VideoProperties, js.Object, js.Any] {
  def dismissFullscreenPlayer(): Unit = js.native
  def presentFullscreenPlayer(): Unit = js.native
  def seek(time: Double): Unit = js.native
  def seek(time: Double, tolerance: Double): Unit = js.native
}

