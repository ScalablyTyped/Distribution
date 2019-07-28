package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorBeacon extends js.Object {
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(
    url: java.lang.String,
    data: Blob | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | FormData | java.lang.String
  ): scala.Boolean = js.native
}

