package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDistinctUntilChangedMod {
  
  @JSImport("rxjs-compat/operators/distinctUntilChanged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinctUntilChanged[T](comparator: js.Function2[/* previous */ T, /* current */ T, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(comparator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def distinctUntilChanged[T, K](
    comparator: js.Function2[/* previous */ K, /* current */ K, Boolean],
    keySelector: js.Function1[/* value */ T, K]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(comparator.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
