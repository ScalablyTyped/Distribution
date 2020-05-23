package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGcmParams extends Algorithm {
  var additionalData: js.UndefOr[
    Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ] = js.undefined
  var iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  var tagLength: js.UndefOr[Double] = js.undefined
}

object AesGcmParams {
  @scala.inline
  def apply(
    iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    name: java.lang.String,
    additionalData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer = null,
    tagLength: js.UndefOr[Double] = js.undefined
  ): AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (!js.isUndefined(tagLength)) __obj.updateDynamic("tagLength")(tagLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
}

