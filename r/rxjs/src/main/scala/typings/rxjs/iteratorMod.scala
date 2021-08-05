package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("rxjs/internal/symbol/iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/symbol/iterator", "$$iterator")
  @js.native
  val $iterator: js.Symbol = js.native
  
  inline def getSymbolIterator(): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolIterator")().asInstanceOf[js.Symbol]
  
  @JSImport("rxjs/internal/symbol/iterator", "iterator")
  @js.native
  val iterator: js.Symbol = js.native
}
