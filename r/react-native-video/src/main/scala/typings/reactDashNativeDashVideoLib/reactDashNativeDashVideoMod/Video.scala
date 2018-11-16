package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video
  extends reactLib.reactMod.Component[VideoProperties, js.Object, js.Any] {
  def dismissFullscreenPlayer(): scala.Unit = js.native
  def presentFullscreenPlayer(): scala.Unit = js.native
  def seek(time: scala.Double): scala.Unit = js.native
  def seek(time: scala.Double, tolerance: scala.Double): scala.Unit = js.native
}

