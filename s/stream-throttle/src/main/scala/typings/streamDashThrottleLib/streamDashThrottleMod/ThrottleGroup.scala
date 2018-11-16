package typings
package streamDashThrottleLib.streamDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-throttle", "ThrottleGroup")
@js.native
class ThrottleGroup protected () extends js.Object {
  def this(options: ThrottleOptions) = this()
  def throttle(options: ThrottleOptions): Throttle = js.native
}

