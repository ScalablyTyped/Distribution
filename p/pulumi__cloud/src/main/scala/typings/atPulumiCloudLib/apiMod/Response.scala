package typings
package atPulumiCloudLib.apiMod

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
  def end(): scala.Unit = js.native
  /**
       * Sends the HTTP response, optionally including data to write to the HTTP
       * response body.
       */
  def end(data: java.lang.String): scala.Unit = js.native
  /**
       * Sends the HTTP response, optionally including data to write to the HTTP
       * response body.
       */
  def end(data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  /**
       * Sends the HTTP response, optionally including data to write to the HTTP
       * response body.
       */
  def end(data: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Sends the HTTP response, optionally including data to write to the HTTP
       * response body.
       */
  def end(data: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  /**
       * Gets the Headers for the Response
       */
  def getHeader(name: java.lang.String): java.lang.String = js.native
  /**
       * JSON serializes an object, writes it to the HTTP response body, and sends
       * the HTTP response.
       */
  def json(obj: js.Any): scala.Unit = js.native
  def redirect(status: scala.Double, url: java.lang.String): scala.Unit = js.native
  /**
       * Mark the response to redirect the client to the provided URL with
       * the optional status code, defaulting to 302.
       */
  def redirect(url: java.lang.String): scala.Unit = js.native
  /**
       * Sets a header on the HTTP response and returns the `Response` for
       * chaining operations.
       */
  def setHeader(name: java.lang.String, value: java.lang.String): Response = js.native
  /**
       * Sets the HTTP response status code and returns a `Response` for chaining
       * operations.
       */
  def status(code: scala.Double): Response = js.native
  /**
       * Writes a string to the HTTP response body and returns the `Response` for
       * chaining operations.
       */
  def write(data: java.lang.String): Response = js.native
  /**
       * Writes a string to the HTTP response body and returns the `Response` for
       * chaining operations.
       */
  def write(data: java.lang.String, encoding: java.lang.String): Response = js.native
  /**
       * Writes a string to the HTTP response body and returns the `Response` for
       * chaining operations.
       */
  def write(data: nodeLib.Buffer): Response = js.native
  /**
       * Writes a string to the HTTP response body and returns the `Response` for
       * chaining operations.
       */
  def write(data: nodeLib.Buffer, encoding: java.lang.String): Response = js.native
}

