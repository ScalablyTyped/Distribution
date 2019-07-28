package typings.seleniumDashWebdriver.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildPath(path: String, parameters: js.Object): String = js.native
  def del(path: String): js.Any = js.native
  def get(path: String): js.Any = js.native
  def headersToString(headers: js.Any): String = js.native
  def parseHttpResponse(httpResponse: Response, w3c: Boolean): js.Any = js.native
  def post(path: String): js.Any = js.native
  def resource(method: String, path: String): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any, opt_data: String): js.Any = js.native
  def sendRequest(options: js.Object, onOk: js.Any, onError: js.Any, opt_data: String, opt_proxy: String): js.Any = js.native
  def tryParse(str: String): js.Any = js.native
}

