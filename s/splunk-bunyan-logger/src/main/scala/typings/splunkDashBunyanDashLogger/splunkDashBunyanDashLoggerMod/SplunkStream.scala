package typings.splunkDashBunyanDashLogger.splunkDashBunyanDashLoggerMod

import typings.node.NodeJSNs.WritableStream
import typings.splunkDashLogging.splunkDashLoggingMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkStream extends WritableStream {
  var logger: Logger = js.native
}

