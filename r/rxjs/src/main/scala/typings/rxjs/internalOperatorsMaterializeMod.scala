package typings.rxjs

import typings.rxjs.distTypesInternalNotificationMod.Notification
import typings.rxjs.distTypesInternalTypesMod.ObservableNotification
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsMaterializeMod {
  
  @JSImport("rxjs/internal/operators/materialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materialize[T](): OperatorFunction[T, Notification[T] & ObservableNotification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, Notification[T] & ObservableNotification[T]]]
}
