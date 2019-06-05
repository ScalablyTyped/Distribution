package typings
package sipDotJsLib.libCoreMessagesUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/uri", "URI")
@js.native
class URI protected ()
  extends sipDotJsLib.libCoreMessagesParametersMod.Parameters {
  /**
    * Constructor
    * @param scheme
    * @param user
    * @param host
    * @param port
    * @param parameters
    * @param headers
    */
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any, headers: js.Any) = this()
  val _normal: js.Any = js.native
  val _raw: js.Any = js.native
  var _toString: js.Any = js.native
  val aor: java.lang.String = js.native
  var escapeUser: js.Any = js.native
  var headerize: js.Any = js.native
  var headers: js.Any = js.native
  var host: java.lang.String = js.native
  var normal: js.Any = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var raw: js.Any = js.native
  var scheme: java.lang.String = js.native
  var user: js.UndefOr[java.lang.String] = js.native
  def clearHeaders(): scala.Unit = js.native
  def deleteHeader(header: java.lang.String): js.Any = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def setHeader(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def toRaw(): java.lang.String = js.native
}

