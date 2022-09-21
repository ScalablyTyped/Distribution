package typings.std.global

import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Number")
@js.native
/* standard es5 */
open class Number ()
  extends StObject
     with typings.std.Number {
  def this(value: Any) = this()
}
object Number {
  
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  inline def apply: NumberConstructor = js.Dynamic.global.selectDynamic("Number").asInstanceOf[NumberConstructor]
}
