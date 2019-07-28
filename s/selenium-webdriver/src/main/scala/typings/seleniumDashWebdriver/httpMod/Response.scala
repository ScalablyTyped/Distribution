package typings.seleniumDashWebdriver.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", "Response")
@js.native
class Response protected () extends js.Object {
  /**
    * @param {number} status The response code.
    * @param {!Object<string>} headers The response headers. All header names
    *     will be converted to lowercase strings for consistent lookups.
    * @param {string} body The response body.
    */
  def this(status: Double, headers: js.Object, body: String) = this()
}

