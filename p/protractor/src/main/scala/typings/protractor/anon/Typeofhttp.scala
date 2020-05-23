package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.seleniumWebdriver.httpMod.HttpClient
import typings.seleniumWebdriver.httpMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhttp extends js.Object {
  var Executor: Instantiable1[/* client */ HttpClient, typings.seleniumWebdriver.httpMod.Executor] = js.native
  var HttpClient: Instantiable1[/* serverUrl */ String, typings.seleniumWebdriver.httpMod.HttpClient] = js.native
  var Request: Instantiable2[/* method */ String, /* path */ String, typings.seleniumWebdriver.httpMod.Request] = js.native
  var Response: Instantiable3[
    /* status */ Double, 
    /* headers */ js.Object, 
    /* body */ String, 
    typings.seleniumWebdriver.httpMod.Response
  ] = js.native
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

