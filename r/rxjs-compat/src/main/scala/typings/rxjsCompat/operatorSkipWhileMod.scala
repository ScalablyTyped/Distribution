package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSkipWhileMod {
  
  @JSImport("rxjs-compat/operator/skipWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
