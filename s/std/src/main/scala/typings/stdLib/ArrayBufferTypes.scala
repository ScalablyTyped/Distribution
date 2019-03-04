package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
trait ArrayBufferTypes extends js.Object {
  var ArrayBuffer: ArrayBuffer
  var SharedArrayBuffer: SharedArrayBuffer
}

object ArrayBufferTypes {
  @scala.inline
  def apply(ArrayBuffer: ArrayBuffer, SharedArrayBuffer: SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer, SharedArrayBuffer = SharedArrayBuffer)
  
    __obj.asInstanceOf[ArrayBufferTypes]
  }
}

