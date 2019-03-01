package typings
package sipDotJsLib.typesUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/uri", "URI")
@js.native
class URI protected () extends Parameters {
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: js.UndefOr[scala.Nothing], parameters: js.Any, headers: js.Any) = this()
  def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any, headers: js.Any) = this()
  var _normal: sipDotJsLib.typesUriMod.URINs.Object = js.native
  var _raw: sipDotJsLib.typesUriMod.URINs.Object = js.native
  var aor: java.lang.String = js.native
  var host: js.UndefOr[java.lang.String] = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var scheme: js.UndefOr[java.lang.String] = js.native
  var user: js.UndefOr[java.lang.String] = js.native
  def clearHeaders(): scala.Unit = js.native
  def deleteHeader(name: java.lang.String): js.Any = js.native
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def setHeader(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def toRaw(): java.lang.String = js.native
}

