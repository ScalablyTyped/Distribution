package typings.std.global

import typings.std.ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Array")
@js.native
open class Array[T] protected ()
  extends StObject
     with typings.std.Array[T] {
  /* standard es5 */
  def this(arrayLength: Double) = this()
  /* standard es5 */
  def this(items: T*) = this()
}
object Array {
  
  inline def apply: ArrayConstructor = js.Dynamic.global.selectDynamic("Array").asInstanceOf[ArrayConstructor]
}
