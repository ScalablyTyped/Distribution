package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomSource extends js.Object {
  def getRandomValues[T /* <: Int8Array | Uint8ClampedArray | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array */](array: T): T
}

@JSGlobal("RandomSource")
@js.native
class RandomSourceCls () extends RandomSource {
  /* CompleteClass */
  override def getRandomValues[T /* <: Int8Array | Uint8ClampedArray | Uint8Array | Int16Array | Uint16Array | Int32Array | Uint32Array */](array: T): T = js.native
}

@JSGlobal("RandomSource")
@js.native
object RandomSource
  extends org.scalablytyped.runtime.Instantiable0[RandomSource]

