package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTakeWhileMod {
  
  @JSImport("rxjs-compat/operator/takeWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
