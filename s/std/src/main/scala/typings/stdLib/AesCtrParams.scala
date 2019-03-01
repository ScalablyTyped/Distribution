package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCtrParams extends Algorithm {
  var counter: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  var length: scala.Double
}

object AesCtrParams {
  @scala.inline
  def apply(
    counter: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    length: scala.Double,
    name: java.lang.String
  ): AesCtrParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AesCtrParams]
  }
}

