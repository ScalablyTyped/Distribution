package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerUpgradeResponse extends js.Object {
  /**
    * Attempt to upgrade.
    */
  def claimUpgrade(): js.Any = js.native
  /**
    * Ends the response
    */
  def end(): Boolean = js.native
  /**
    * Sends the response.
    * @param body - the response to send out
    */
  def send(body: js.Any): Boolean = js.native
  /**
    * Sends the response.
    * @param code - the http status code
    * @param body - the response to send out
    */
  def send(code: Double, body: js.Any): js.Any = js.native
  /**
    * Set the status code of the response.
    * @param code - the http status code
    */
  def status(code: Double): Double = js.native
  /**
    * Write to the response.
    */
  def write(): Boolean = js.native
  /**
    * Write to the head of the response.
    * @param statusCode - the http status code
    * @param reason -  a message
    */
  def writeHead(statusCode: Double): Unit = js.native
  def writeHead(statusCode: Double, reason: String): Unit = js.native
}

