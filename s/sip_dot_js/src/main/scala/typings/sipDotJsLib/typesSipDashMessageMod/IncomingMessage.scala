package typings
package sipDotJsLib.typesSipDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/sip-message", "IncomingMessage")
@js.native
class IncomingMessage () extends js.Object {
  var body: java.lang.String | js.Any = js.native
  var callId: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var data: java.lang.String = js.native
  var from: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var fromTag: java.lang.String = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var method: java.lang.String = js.native
  var referTo: js.UndefOr[java.lang.String] = js.native
  var to: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var toTag: java.lang.String = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var via: sipDotJsLib.Anon_Host = js.native
  var viaBranch: java.lang.String = js.native
  def addHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def parseHeader(name: java.lang.String): js.UndefOr[_] = js.native
  def parseHeader(name: java.lang.String, idx: scala.Double): js.UndefOr[_] = js.native
  def s(name: java.lang.String): js.UndefOr[_] = js.native
  def s(name: java.lang.String, idx: scala.Double): js.UndefOr[_] = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

