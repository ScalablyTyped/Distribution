package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): Promise[RTCStatsReport] = js.native
  def msGetStats(): Promise[RTCStatsReport] = js.native
}

@JSGlobal("RTCStatsProvider")
@js.native
object RTCStatsProvider
  extends ScalablyTyped.runtime.Instantiable0[RTCStatsProvider]

