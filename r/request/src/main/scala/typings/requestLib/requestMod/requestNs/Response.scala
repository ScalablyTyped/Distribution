package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends nodeLib.httpMod.IncomingMessage {
  var body: js.Any = js.native
   // Buffer, string, stream.Readable, or a plain object if `json` was truthy
  var caseless: caselessLib.caselessMod.Caseless = js.native
  var elapsedTime: js.UndefOr[scala.Double] = js.native
  var request: Request = js.native
  @JSName("statusCode")
  var statusCode_Response: scala.Double = js.native
  @JSName("statusMessage")
  var statusMessage_Response: java.lang.String = js.native
  var timingPhases: js.UndefOr[requestLib.Anon_Dns] = js.native
  var timingStart: js.UndefOr[scala.Double] = js.native
  var timings: js.UndefOr[requestLib.Anon_Lookup] = js.native
   // case-insensitive access to headers
  def toJSON(): ResponseAsJSON = js.native
}

