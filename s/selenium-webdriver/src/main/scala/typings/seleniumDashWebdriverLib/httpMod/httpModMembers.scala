package typings
package seleniumDashWebdriverLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", JSImport.Namespace)
@js.native
object httpModMembers extends js.Object {
  def buildPath(path: java.lang.String, parameters: js.Object): java.lang.String = js.native
  def del(path: java.lang.String): js.Any = js.native
  def get(path: java.lang.String): js.Any = js.native
  def headersToString(headers: js.Any): java.lang.String = js.native
  def parseHttpResponse(httpResponse: Response, w3c: scala.Boolean): js.Any = js.native
  def post(path: java.lang.String): js.Any = js.native
  def resource(method: java.lang.String, path: java.lang.String): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any, opt_data: java.lang.String): js.Any = js.native
  def sendRequest(
    options: js.Object,
    onOk: js.Any,
    onError: js.Any,
    opt_data: java.lang.String,
    opt_proxy: java.lang.String
  ): js.Any = js.native
  def tryParse(str: java.lang.String): js.Any = js.native
}

