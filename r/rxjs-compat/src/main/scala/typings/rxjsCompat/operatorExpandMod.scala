package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorExpandMod {
  
  @JSImport("rxjs-compat/operator/expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def expand_TR[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def expand_TR[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def expand_TR[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def expand_TR[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
