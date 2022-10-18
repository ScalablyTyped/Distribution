package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorFilterMod {
  
  @JSImport("rxjs-compat/operator/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Observable_[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[S]]
  inline def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Observable_[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[S]]
}
