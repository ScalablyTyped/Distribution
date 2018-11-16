package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySession extends EventTarget {
  val closed: Promise[scala.Unit] = js.native
  val expiration: scala.Double = js.native
  val keyStatuses: MediaKeyStatusMap = js.native
  val sessionId: java.lang.String = js.native
  def close(): Promise[scala.Unit] = js.native
  def generateRequest(initDataType: java.lang.String): Promise[scala.Unit] = js.native
  def generateRequest(
    initDataType: java.lang.String,
    initData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Promise[scala.Unit] = js.native
  def load(sessionId: java.lang.String): Promise[scala.Boolean] = js.native
  def remove(): Promise[scala.Unit] = js.native
  def update(): Promise[scala.Unit] = js.native
  def update(
    response: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Promise[scala.Unit] = js.native
}

@JSGlobal("MediaKeySession")
@js.native
object MediaKeySession
  extends ScalablyTyped.runtime.Instantiable0[MediaKeySession]

