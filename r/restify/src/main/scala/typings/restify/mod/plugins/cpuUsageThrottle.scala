package typings.restify.mod.plugins

import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.cpuUsageThrottle")
@js.native
object cpuUsageThrottle extends js.Object {
  
  /**
    * Cpu Throttle middleware
    */
  def apply(): RequestHandler = js.native
  def apply(opts: CpuUsageThrottleOptions): RequestHandler = js.native
}
