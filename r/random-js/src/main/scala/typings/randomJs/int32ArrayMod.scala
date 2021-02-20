package typings.randomJs

import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Int32ArrayConstructor
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int32ArrayMod {
  
  @JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("random-js/dist/utils/Int32Array", "Int32Array")
  @js.native
  class Int32Array ()
    extends typings.std.Int32Array {
    def this(array: ArrayBufferLike) = this()
    def this(array: ArrayLike[Double]) = this()
    def this(elements: Iterable[Double]) = this()
    def this(length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  }
  /* was `typeof Int32Array` */
  @JSImport("random-js/dist/utils/Int32Array", "Int32Array")
  @js.native
  def Int32Array: Int32ArrayConstructor = js.native
  @scala.inline
  def Int32Array_=(x: Int32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32Array")(x.asInstanceOf[js.Any])
}
