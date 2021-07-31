package typings.std.global

import typings.std.VBArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VBArray")
@js.native
class VBArray[T] protected ()
  extends StObject
     with typings.std.VBArray[T] {
  def this(safeArray: typings.std.SafeArray[T]) = this()
}
object VBArray {
  
  @scala.inline
  def apply: VBArrayConstructor = js.Dynamic.global.selectDynamic("VBArray").asInstanceOf[VBArrayConstructor]
}
