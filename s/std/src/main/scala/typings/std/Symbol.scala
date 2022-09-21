package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends StObject {
  
  /**
    * Expose the [[Description]] internal slot of a symbol directly.
    */
  /* standard es2019.symbol */
  val description: js.UndefOr[java.lang.String] = js.native
  
  /**
    * Converts a Symbol object to a symbol.
    */
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: js.Function1[/* hint */ java.lang.String, js.Symbol] = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
