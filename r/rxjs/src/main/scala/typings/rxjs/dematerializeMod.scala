package typings.rxjs

import typings.rxjs.notificationMod.Notification
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dematerializeMod {
  
  @JSImport("rxjs/internal/operators/dematerialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dematerialize[T](): OperatorFunction[Notification[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[Notification[T], T]]
}
