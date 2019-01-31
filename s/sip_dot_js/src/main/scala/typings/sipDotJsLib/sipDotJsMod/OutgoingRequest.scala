package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "OutgoingRequest")
@js.native
class OutgoingRequest protected ()
  extends sipDotJsLib.typesSipDashMessageMod.OutgoingRequest {
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.typesUriMod.URI, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.typesUriMod.URI, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
}

