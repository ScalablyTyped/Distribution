package typings.roads.roadsMod

import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "Road")
@js.native
class Road () extends js.Object {
  /**
    * Locate and execute the resource method associated with the request parameters
    * @param method The request HTTP method
    * @param url The request Url
    * @param body the request body
    * @param headers The request headers
    * @see <a href="https://github.com/Dashron/roads#roadrequeststring-method-string-url-dynamic-body-object-headers"
    * target="_blank">Road.request(string method, string url, dynamic body, Object headers)</a>
    */
  def request(method: String, url: String): js.Any = js.native
  def request(method: String, url: String, body: js.Any): js.Any = js.native
  def request(method: String, url: String, body: js.Any, headers: Headers): js.Any = js.native
  /**
    * Add a custom function that will be executed before every request
    * @param fn Will be called any time a request is made on the object.
    * @see <a href="https://github.com/dancespiele/roads#roadusefunction-fn" target="_blank">Road.use(Function fn)</a>
    */
  def use(
    fn: js.Function5[
      /* method */ String, 
      /* url */ js.Any, 
      /* body */ js.Any, 
      /* headers */ Headers, 
      /* next */ js.Function0[_], 
      _
    ]
  ): js.Any = js.native
}

