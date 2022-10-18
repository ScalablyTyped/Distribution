package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorFirstMod {
  
  @JSImport("rxjs-compat/operator/first", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def first[T, D](): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Observable_[T | D]]
  inline def first[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | D]]
  inline def first[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    defaultValue: D
  ): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  inline def first[T, D](predicate: Null, defaultValue: D): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  inline def first[T, D](predicate: Unit, defaultValue: D): Observable_[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | D]]
  
  inline def first_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean]
  ): Observable_[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[S]]
  inline def first_TS[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean],
    defaultValue: S
  ): Observable_[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[S]]
}
