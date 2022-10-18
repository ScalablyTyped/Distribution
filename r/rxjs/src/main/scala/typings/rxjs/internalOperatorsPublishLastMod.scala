package typings.rxjs

import typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsPublishLastMod {
  
  @JSImport("rxjs/internal/operators/publishLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
}
