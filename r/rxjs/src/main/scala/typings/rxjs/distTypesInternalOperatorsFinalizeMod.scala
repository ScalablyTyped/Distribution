package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsFinalizeMod {
  
  @JSImport("rxjs/dist/types/internal/operators/finalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalize")(callback.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
