package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def msGetStats(): js.Promise[RTCStatsReport] = js.native
}

@JSGlobal("RTCStatsProvider")
@js.native
class RTCStatsProviderCls () extends RTCStatsProvider

@JSGlobal("RTCStatsProvider")
@js.native
object RTCStatsProvider extends Instantiable0[RTCStatsProvider]

