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

