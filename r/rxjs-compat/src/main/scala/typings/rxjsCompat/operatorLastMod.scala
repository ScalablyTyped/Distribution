package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorLastMod {
  
  @JSImport("rxjs-compat/operator/last", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def last[T, D](): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[Observable_[T | D]]
  inline def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | D]]
  inline def last[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    defaultValue: D
  ): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  inline def last[T, D](predicate: Null, defaultValue: D): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  inline def last[T, D](predicate: Unit, defaultValue: D): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  
  inline def last_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean]
  ): Observable_[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[S]]
  inline def last_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean],
    defaultValue: S
  ): Observable_[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[S]]
}
