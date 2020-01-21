package typings.riotApiNodejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-api-nodejs", "API")
@js.native
class API protected () extends js.Object {
  def this(ApiKeys: js.Array[String]) = this()
  var ApiKey: js.Any = js.native
  var ApiKeys: js.Any = js.native
  /**
    * get the API Key that is used for the requests
    * @return    {string}    the current API Key
    */
  def getCurrentApiKey(): String = js.native
  /**
    * Send a request to the Riot Games Api and return a formatted json via a callback
    * @param     {string}    url         request url
    * @param     {string}    method      method(post / put / get)
    * @param     {[type]}    data        body parameters
    * @param     {(JSON}     callback    callback function with formatted JSON
    */
  def getJSON(url: String, method: String, data: js.Any): js.Promise[_] = js.native
  def request(url: String, method: String, data: js.Any): js.Promise[_] = js.native
  def request(url: String, method: String, data: js.Any, prop: String): js.Promise[_] = js.native
  /**
    * set the API Keys
    * @param    {string[]}    ApiKeys    the API Keys
    */
  def setApikeys(ApiKeys: js.Array[String]): Unit = js.native
  /**
    * Change the Api Key for the next requests
    */
  /* private */ def switchApiKey(): js.Any = js.native
}

