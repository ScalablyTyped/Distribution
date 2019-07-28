package typings.request.requestMod

import typings.caseless.caselessMod.Caseless
import typings.node.httpMod.IncomingMessage
import typings.request.Anon_Connect
import typings.request.Anon_Dns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends IncomingMessage {
  var body: js.Any = js.native
   // Buffer, string, stream.Readable, or a plain object if `json` was truthy
  var caseless: Caseless = js.native
  var elapsedTime: js.UndefOr[Double] = js.native
  var request: Request = js.native
  @JSName("statusCode")
  var statusCode_Response: Double = js.native
  @JSName("statusMessage")
  var statusMessage_Response: String = js.native
  var timingPhases: js.UndefOr[Anon_Dns] = js.native
  var timingStart: js.UndefOr[Double] = js.native
  var timings: js.UndefOr[Anon_Connect] = js.native
   // case-insensitive access to headers
  def toJSON(): ResponseAsJSON = js.native
}

