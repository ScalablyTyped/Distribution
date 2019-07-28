package typings.roads.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "Response")
@js.native
class Response protected () extends js.Object {
  def this(body: js.Any, status: Double) = this()
  def this(body: js.Any, status: Double, headers: Option) = this()
  /**
    * Get all the cookies
    */
  def getCookies(): js.Any = js.native
  /**
    * Add a cookie method to the response object. Allows you to set cookies
    * @param name The name of the cookie
    * @param value The value name
    * @param options Cookie options
    */
  def setCookie(name: String, value: String): Unit = js.native
  def setCookie(name: String, value: String, options: js.Any): Unit = js.native
}

