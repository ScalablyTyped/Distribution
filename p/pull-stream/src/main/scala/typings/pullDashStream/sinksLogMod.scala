package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/log", JSImport.Namespace)
@js.native
object sinksLogMod extends js.Object {
  /**
    * Output the stream to `console.log`.
    */
  def apply(): Sink[_] = js.native
}

