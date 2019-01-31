package typings
package sipDotJsLib.typesSipDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/sip-message", "OutgoingRequest")
@js.native
class OutgoingRequest protected () extends js.Object {
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.typesUriMod.URI, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.typesUriMod.URI, ua: sipDotJsLib.typesUaMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
  var body: java.lang.String | js.Any = js.native
  var callId: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var dialog: js.UndefOr[sipDotJsLib.typesDialogsMod.Dialog] = js.native
  var extraHeaders: js.Array[java.lang.String] = js.native
  var from: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  var method: java.lang.String = js.native
  var ruri: java.lang.String | sipDotJsLib.typesUriMod.URI = js.native
  var to: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def cancel(reason: java.lang.String, extraHeaders: js.Array[java.lang.String]): scala.Unit = js.native
  def cancel(reason: js.UndefOr[scala.Nothing], extraHeaders: js.Array[java.lang.String]): scala.Unit = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
}

