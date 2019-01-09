package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Body extends js.Object {
  var Executor: org.scalablytyped.runtime.Instantiable1[
    /* client */ seleniumDashWebdriverLib.httpMod.HttpClient, 
    seleniumDashWebdriverLib.httpMod.Executor
  ] = js.native
  var HttpClient: org.scalablytyped.runtime.Instantiable1[/* serverUrl */ java.lang.String, seleniumDashWebdriverLib.httpMod.HttpClient] = js.native
  var Request: org.scalablytyped.runtime.Instantiable2[
    /* method */ java.lang.String, 
    /* path */ java.lang.String, 
    seleniumDashWebdriverLib.httpMod.Request
  ] = js.native
  var Response: org.scalablytyped.runtime.Instantiable3[
    /* status */ scala.Double, 
    /* headers */ js.Object, 
    /* body */ java.lang.String, 
    seleniumDashWebdriverLib.httpMod.Response
  ] = js.native
  def buildPath(path: java.lang.String, parameters: js.Object): java.lang.String = js.native
  def del(path: java.lang.String): js.Any = js.native
  def get(path: java.lang.String): js.Any = js.native
  def headersToString(headers: js.Any): java.lang.String = js.native
  def parseHttpResponse(httpResponse: seleniumDashWebdriverLib.httpMod.Response, w3c: scala.Boolean): js.Any = js.native
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

