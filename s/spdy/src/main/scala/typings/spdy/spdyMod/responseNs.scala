package typings.spdy.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "response")
@js.native
object responseNs extends js.Object {
  def end(data: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def writeHead(statusCode: Double, obj: js.Object): Unit = js.native
  def writeHead(statusCode: Double, reason: String, obj: js.Object): Unit = js.native
}

