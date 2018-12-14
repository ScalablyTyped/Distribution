package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Crypto extends js.Object {
  val subtle: SubtleCrypto
  def getRandomValues[T /* <: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | scala.Null */](array: T): T
}

@JSGlobal("Crypto")
@js.native
object Crypto
  extends org.scalablytyped.runtime.Instantiable0[Crypto]

