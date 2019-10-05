package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.cpuUsageThrottle")
@js.native
object cpuUsageThrottle extends js.Object {
  /**
    * Cpu Throttle middleware
    */
  def apply(): RequestHandler = js.native
  def apply(opts: CpuUsageThrottleOptions): RequestHandler = js.native
}

