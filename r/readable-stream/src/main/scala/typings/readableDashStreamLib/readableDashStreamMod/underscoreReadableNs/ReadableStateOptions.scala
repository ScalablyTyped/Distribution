package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_readable ====
trait ReadableStateOptions extends js.Object {
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  var readableHighWaterMark: js.UndefOr[scala.Double] = js.undefined
  var readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
}

object ReadableStateOptions {
  @scala.inline
  def apply(
    defaultEncoding: java.lang.String = null,
    encoding: java.lang.String = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    readableHighWaterMark: scala.Int | scala.Double = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined
  ): ReadableStateOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (readableHighWaterMark != null) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    __obj.asInstanceOf[ReadableStateOptions]
  }
}

