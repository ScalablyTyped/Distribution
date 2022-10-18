package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableNotification
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ValueFromNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsDematerializeMod {
  
  @JSImport("rxjs/dist/types/internal/operators/dematerialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dematerialize[N /* <: ObservableNotification[Any] */](): OperatorFunction[N, ValueFromNotification[N]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[N, ValueFromNotification[N]]]
}
