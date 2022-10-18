package typings.randomJs

import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Int32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsInt32ArrayMod {
  
  @JSImport("random-js/dist/utils/Int32Array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("random-js/dist/utils/Int32Array", "Int32Array")
  @js.native
  /* standard es2017.typedarrays */
  open class Int32Array ()
    extends StObject
       with typings.std.Int32Array {
    def this(array: ArrayBufferLike) = this()
    /* standard es5 */
    def this(array: ArrayLike[Double]) = this()
    /* standard es2015.iterable */
    def this(elements: js.Iterable[Double]) = this()
    /* standard es5 */
    def this(length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
  }
  /* was `typeof Int32Array` */
  @JSImport("random-js/dist/utils/Int32Array", "Int32Array")
  @js.native
  def Int32Array: Int32ArrayConstructor = js.native
  inline def Int32Array_=(x: Int32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32Array")(x.asInstanceOf[js.Any])
}
