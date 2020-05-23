package typings.rawBody.mod

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
    expected: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    received: js.UndefOr[Double] = js.undefined,
    stack: String = null
  ): RawBodyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(received)) __obj.updateDynamic("received")(received.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawBodyError]
  }
}

