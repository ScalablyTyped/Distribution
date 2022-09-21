package typings.std.global

import typings.std.ArrayBufferLike
import typings.std.BigUint64ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("BigUint64Array")
@js.native
/* standard es2020.bigint */
open class BigUint64Array ()
  extends StObject
     with typings.std.BigUint64Array {
  /* standard es2020.bigint */
  def this(array: js.Iterable[js.BigInt]) = this()
  /* standard es2020.bigint */
  def this(buffer: ArrayBufferLike) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object BigUint64Array {
  
  inline def apply: BigUint64ArrayConstructor = js.Dynamic.global.selectDynamic("BigUint64Array").asInstanceOf[BigUint64ArrayConstructor]
}
