package typings.streamThrottle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-throttle", "ThrottleGroup")
@js.native
class ThrottleGroup protected () extends js.Object {
  def this(options: ThrottleOptions) = this()
  
  def throttle(options: ThrottleOptions): Throttle = js.native
}
