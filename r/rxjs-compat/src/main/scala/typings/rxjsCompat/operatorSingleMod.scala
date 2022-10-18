package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSingleMod {
  
  @JSImport("rxjs-compat/operator/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def single[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[Observable_[T]]
  inline def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
