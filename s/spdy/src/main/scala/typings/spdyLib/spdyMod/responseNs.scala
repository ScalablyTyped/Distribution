package typings
package spdyLib.spdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "response")
@js.native
object responseNs extends js.Object {
  def end(data: js.Any, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, obj: js.Object): scala.Unit = js.native
  def writeHead(statusCode: scala.Double, reason: java.lang.String, obj: js.Object): scala.Unit = js.native
}

