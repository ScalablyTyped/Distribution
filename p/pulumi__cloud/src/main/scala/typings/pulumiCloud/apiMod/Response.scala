package typings.pulumiCloud.apiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /**
    * Object containing local variables scoped to a single request. Useful for
    * exposing request-level information such as user settings.
    */
  var locals: js.Any = js.native
  /**
    * Sends the HTTP response, optionally including data to write to the HTTP
    * response body.
    */
  def end(): Unit = js.native
  def end(data: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def end(data: String): Unit = js.native
  def end(data: String, encoding: String): Unit = js.native
  def end(data: Buffer): Unit = js.native
  def end(data: Buffer, encoding: String): Unit = js.native
  /**
    * Gets the Headers for the Response
    */
  def getHeader(name: String): String = js.native
  /**
    * JSON serializes an object, writes it to the HTTP response body, and sends
    * the HTTP response.
    */
  def json(obj: js.Any): Unit = js.native
  def redirect(status: Double, url: String): Unit = js.native
  /**
    * Mark the response to redirect the client to the provided URL with
    * the optional status code, defaulting to 302.
    */
  def redirect(url: String): Unit = js.native
  /**
    * Sets a header on the HTTP response and returns the `Response` for
    * chaining operations.
    */
  def setHeader(name: String, value: String): Response = js.native
  /**
    * Sets the HTTP response status code and returns a `Response` for chaining
    * operations.
    */
  def status(code: Double): Response = js.native
  /**
    * Writes a string to the HTTP response body and returns the `Response` for
    * chaining operations.
    */
  def write(data: String): Response = js.native
  def write(data: String, encoding: String): Response = js.native
  def write(data: Buffer): Response = js.native
  def write(data: Buffer, encoding: String): Response = js.native
}

