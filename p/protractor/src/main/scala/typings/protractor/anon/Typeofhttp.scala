package typings.protractor.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.seleniumWebdriver.httpMod.HttpClient
import typings.seleniumWebdriver.httpMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhttp extends StObject {
  
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
  
  def del(path: String): Any = js.native
  
  def get(path: String): Any = js.native
  
  def headersToString(headers: Any): String = js.native
  
  def parseHttpResponse(httpResponse: Response, w3c: Boolean): Any = js.native
  
  def post(path: String): Any = js.native
  
  def resource(method: String, path: String): Any = js.native
  
  def sendRequest(options: js.Object, onOk: Any, onError: Any): Any = js.native
  def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: String): Any = js.native
  def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: String, opt_proxy: String): Any = js.native
  def sendRequest(options: js.Object, onOk: Any, onError: Any, opt_data: Unit, opt_proxy: String): Any = js.native
  
  def tryParse(str: String): Any = js.native
}
