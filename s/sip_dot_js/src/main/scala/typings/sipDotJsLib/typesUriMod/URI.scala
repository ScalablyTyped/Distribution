package typings
package sipDotJsLib.typesUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/uri", "URI")
@js.native
class URI protected () extends js.Object {
  def this(scheme: js.UndefOr[java.lang.String], user: js.UndefOr[java.lang.String], host: js.UndefOr[java.lang.String], port: js.UndefOr[scala.Double], parameters: js.UndefOr[js.Array[java.lang.String]], headers: js.UndefOr[js.Array[java.lang.String]]) = this()
  var host: js.UndefOr[java.lang.String] = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var scheme: js.UndefOr[java.lang.String] = js.native
  var user: js.UndefOr[java.lang.String] = js.native
  def clearHeaders(): scala.Unit = js.native
  def clearParams(): scala.Unit = js.native
  def deleteHeader(name: java.lang.String): js.Array[java.lang.String] = js.native
  def deleteParam(key: java.lang.String): java.lang.String = js.native
  def getHeader(name: java.lang.String): js.Array[java.lang.String] = js.native
  def getParam(key: java.lang.String): java.lang.String = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def hasParam(key: java.lang.String): java.lang.String = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setParam(key: java.lang.String): scala.Unit = js.native
  def setParam(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSImport("sip.js/types/uri", "URI")
@js.native
object URI extends js.Object {
  def parse(uri: java.lang.String): sipDotJsLib.typesUriMod.URI = js.native
}

