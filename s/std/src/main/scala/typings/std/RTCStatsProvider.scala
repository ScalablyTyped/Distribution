package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def msGetStats(): js.Promise[RTCStatsReport] = js.native
}

