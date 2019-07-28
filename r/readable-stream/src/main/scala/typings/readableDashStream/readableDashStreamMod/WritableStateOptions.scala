package typings.readableDashStream.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStateOptions extends js.Object {
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var writableHighWaterMark: js.UndefOr[Double] = js.undefined
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
}

object WritableStateOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    writableHighWaterMark: Int | Double = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined
  ): WritableStateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (writableHighWaterMark != null) __obj.updateDynamic("writableHighWaterMark")(writableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    __obj.asInstanceOf[WritableStateOptions]
  }
}

