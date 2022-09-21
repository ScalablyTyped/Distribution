package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableNotification
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materializeMod {
  
  @JSImport("rxjs/dist/types/internal/operators/materialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materialize[T](): OperatorFunction[T, Notification[T] & ObservableNotification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, Notification[T] & ObservableNotification[T]]]
}
