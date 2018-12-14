package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeyStatusMap extends js.Object {
  val size: scala.Double = js.native
  def forEach(callback: js.Function): scala.Unit = js.native
  def forEach(callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def get(): MediaKeyStatus = js.native
  def get(
    keyId: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): MediaKeyStatus = js.native
  def has(): scala.Boolean = js.native
  def has(
    keyId: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): scala.Boolean = js.native
}

@JSGlobal("MediaKeyStatusMap")
@js.native
object MediaKeyStatusMap
  extends org.scalablytyped.runtime.Instantiable0[MediaKeyStatusMap]

