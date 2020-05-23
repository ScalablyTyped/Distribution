package typings.randomJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Int32ArrayConstructor
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
@js.native
object int32ArrayMod extends js.Object {
  @js.native
  class Int32Array ()
    extends typings.std.Int32Array {
    def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
    def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
    def this(elements: Iterable[Double]) = this()
    def this(length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  }
  
  @js.native
  object Int32Array
    extends TopLevel[
          Int32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int32Array])
        ]
  
}

