package typings.std.global

import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Boolean")
@js.native
/* standard es5 */
open class Boolean ()
  extends StObject
     with typings.std.Boolean {
  def this(value: Any) = this()
}
object Boolean {
  
  inline def apply: BooleanConstructor = js.Dynamic.global.selectDynamic("Boolean").asInstanceOf[BooleanConstructor]
}
