package typings.std.global

import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WeakSet")
@js.native
/* standard es2015.collection */
open class WeakSet[T /* <: js.Object */] ()
  extends StObject
     with typings.std.WeakSet[T] {
  /* standard es2015.iterable */
  def this(iterable: js.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}
object WeakSet {
  
  inline def apply: WeakSetConstructor = js.Dynamic.global.selectDynamic("WeakSet").asInstanceOf[WeakSetConstructor]
}
