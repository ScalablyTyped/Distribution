package typings.std.global

import typings.std.ArrayBufferLike
import typings.std.BigInt64ArrayConstructor
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("BigInt64Array")
@js.native
class BigInt64Array ()
  extends StObject
     with typings.std.BigInt64Array {
  def this(array: Iterable[js.BigInt]) = this()
  def this(buffer: ArrayBufferLike) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object BigInt64Array {
  
  @scala.inline
  def apply: BigInt64ArrayConstructor = js.Dynamic.global.selectDynamic("BigInt64Array").asInstanceOf[BigInt64ArrayConstructor]
}
