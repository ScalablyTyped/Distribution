package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(): Promise[scala.Unit] = js.native
  def setServerCertificate(
    serverCertificate: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Promise[scala.Unit] = js.native
}

@JSGlobal("MediaKeys")
@js.native
object MediaKeys
  extends ScalablyTyped.runtime.Instantiable0[MediaKeys]

