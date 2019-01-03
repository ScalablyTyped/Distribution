package typings
package sipDotJsLib.typesNameDashAddrDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/name-addr-header", "NameAddrHeader")
@js.native
class NameAddrHeader protected () extends js.Object {
  def this(uri: sipDotJsLib.typesUriMod.URI, displayName: java.lang.String, parameters: js.Array[sipDotJsLib.Anon_Key]) = this()
  var displayName: java.lang.String = js.native
  var uri: sipDotJsLib.typesUriMod.URI = js.native
  def clearParams(): scala.Unit = js.native
  def deleteParam(key: java.lang.String): java.lang.String = js.native
  def getParam(key: java.lang.String): java.lang.String = js.native
  def setParam(key: java.lang.String): scala.Unit = js.native
  def setParam(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSImport("sip.js/types/name-addr-header", "NameAddrHeader")
@js.native
object NameAddrHeader extends js.Object {
  def parse(name_addr_header: java.lang.String): sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
}

