package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends js.Object {
  
  /**
    * Expose the [[Description]] internal slot of a symbol directly.
    */
  val description: js.UndefOr[java.lang.String] = js.native
  
  /**
    * Converts a Symbol object to a symbol.
    */
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: js.Function1[/* hint */ java.lang.String, js.Symbol] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
