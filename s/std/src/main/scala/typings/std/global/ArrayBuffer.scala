package typings.std.global

import typings.std.ArrayBufferConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ArrayBuffer")
@js.native
open class ArrayBuffer protected ()
  extends StObject
     with typings.std.ArrayBuffer {
  /* standard es5 */
  def this(byteLength: Double) = this()
}
object ArrayBuffer {
  
  inline def apply: ArrayBufferConstructor = js.Dynamic.global.selectDynamic("ArrayBuffer").asInstanceOf[ArrayBufferConstructor]
}
