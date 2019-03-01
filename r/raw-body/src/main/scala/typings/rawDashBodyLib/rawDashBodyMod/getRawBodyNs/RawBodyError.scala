package typings
package rawDashBodyLib.rawDashBodyMod.getRawBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawBodyError
  extends nodeLib.Error {
  /**
    * The encoding.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var expected: js.UndefOr[scala.Double] = js.undefined
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * The limit in bytes.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The received bytes.
    */
  var received: js.UndefOr[scala.Double] = js.undefined
  /**
    * The corresponding status code for the error.
    */
  var status: scala.Double
  var statusCode: scala.Double
  /**
    * The error type.
    */
  var `type`: java.lang.String
}

object RawBodyError {
  @scala.inline
  def apply(
    status: scala.Double,
    statusCode: scala.Double,
    `type`: java.lang.String,
    encoding: java.lang.String = null,
    expected: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    received: scala.Int | scala.Double = null,
    stack: java.lang.String = null
  ): RawBodyError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusCode")(statusCode)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (received != null) __obj.updateDynamic("received")(received.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RawBodyError]
  }
}

