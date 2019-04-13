package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var id: java.lang.String = js.native
  @JSName("onRender")
  var onRender_Original: ProfilerOnRenderCallback = js.native
  @JSName("onRender")
  def onRender_mount(
    id: java.lang.String,
    phase: reactLib.reactLibStrings.mount,
    actualDuration: scala.Double,
    baseDuration: scala.Double,
    startTime: scala.Double,
    commitTime: scala.Double,
    interactions: stdLib.Set[SchedulerInteraction]
  ): scala.Unit = js.native
  @JSName("onRender")
  def onRender_update(
    id: java.lang.String,
    phase: reactLib.reactLibStrings.update,
    actualDuration: scala.Double,
    baseDuration: scala.Double,
    startTime: scala.Double,
    commitTime: scala.Double,
    interactions: stdLib.Set[SchedulerInteraction]
  ): scala.Unit = js.native
}

