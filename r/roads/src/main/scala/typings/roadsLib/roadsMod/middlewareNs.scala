package typings
package roadsLib.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "middleware")
@js.native
object middlewareNs extends js.Object {
  /**
    *  Middleware to Apply proper cors headers
    */
  @js.native
  /**
    * @param road The road for the routers
    */
  class SimpleRouter () extends js.Object {
    def this(road: roadsLib.roadsMod.Road) = this()
    /**
      * It have all the routers configured
      */
    var routers: js.Array[roadsLib.roadsMod.Router] = js.native
    /**
      * Add a route to receive the request
      * @param method Methot to receive the request
      * @param path Paht to receive the request
      * @param fn Handle the request received
      */
    def addRoute(
      method: java.lang.String,
      path: java.lang.String,
      fn: js.Function4[
          /* url */ js.Any, 
          /* body */ js.Any, 
          /* headers */ stdLib.Headers, 
          /* next */ js.Function0[_], 
          _
        ]
    ): js.Any = js.native
    /**
      * Receive file request
      * @param file_path path of the file to receive
      * @param prefix prefix of the path file
      */
    def addRouteFile(file_path: java.lang.String): js.Any = js.native
    def addRouteFile(file_path: java.lang.String, prefix: java.lang.String): js.Any = js.native
    /**
      * @param road apply manualy the router middleware
      */
    def applyMiddleware(road: roadsLib.roadsMod.Road): scala.Unit = js.native
  }
  
  /**
    * Very simple middleware to apply a single value to the request context
    * @param key The key that should store the value on the request context
    * @param val val The value to apply to the request context
    */
  def applyToContext(key: java.lang.String, `val`: js.Any): js.Function0[_] = js.native
  /**
    * Middleware to Apply proper cors headers
    * @param options Cors options
    */
  def cors(options: roadsLib.roadsMod.Cors): js.Any = js.native
  /**
    * Middleware to kill the trailing slash on http requests
    * @see <a href="https://github.com/Dashron/roads#killslash" target="_blank">killSlash()</a>
    */
  def killSlash(): js.Any = js.native
  /**
    * Translate the request body into a usable value
    * @param body request body
    * @param content_type media type of the body
    */
  def parseBody(body: js.Any, content_type: java.lang.String): js.Object | java.lang.String = js.native
  /**
    * Applies a method to the request context that allows you to make requests into another roads object
    * @param key The name of the key in the request context that will store the roads request
    * @param road road The roads object that you will interact with
    */
  def reroute(key: java.lang.String, road: roadsLib.roadsMod.Road): js.Function0[_] = js.native
  /**
    * Adds two simple functions to get and set a page title on the request context. This is very helpful for isomorphic js, since on the client, page titles aren't part of the rendered view data.
    */
  def setTitle(): js.Any = js.native
}

