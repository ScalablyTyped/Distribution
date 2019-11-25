package typings.rawDashBody.rawDashBodyMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawBodyError extends Error {
  /**
    * The encoding.
    */
  var encoding: js.UndefOr[String] = js.undefined
  var expected: js.UndefOr[Double] = js.undefined
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The limit in bytes.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The received bytes.
    */
  var received: js.UndefOr[Double] = js.undefined
  /**
    * The corresponding status code for the error.
    */
  var status: Double
  var statusCode: Double
  /**
    * The error type.
    */
  var `type`: String
}

object RawBodyError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    status: Double,
    statusCode: Double,
    `type`: String,
    encoding: String = null,
    expected: Int | Double = null,
    length: Int | Double = null,
    limit: Int | Double = null,
    received: Int | Double = null,
    stack: String = null
  ): RawBodyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (received != null) __obj.updateDynamic("received")(received.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawBodyError]
  }
}

