package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorFindMod {
  
  @JSImport("rxjs-compat/operator/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.UndefOr[T]]]
  inline def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Observable_[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.UndefOr[T]]]
  
  inline def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Observable_[js.UndefOr[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.UndefOr[S]]]
  inline def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Observable_[js.UndefOr[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.UndefOr[S]]]
}
