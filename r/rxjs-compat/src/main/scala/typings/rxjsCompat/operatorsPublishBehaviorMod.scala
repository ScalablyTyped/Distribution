package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsPublishBehaviorMod {
  
  @JSImport("rxjs-compat/operators/publishBehavior", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishBehavior[T](initialValue: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(initialValue.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
}
