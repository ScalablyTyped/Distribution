package typings.rxjs

import typings.rxjs.notificationMod.Notification
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materializeMod {
  
  @JSImport("rxjs/internal/operators/materialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def materialize[T](): OperatorFunction[T, Notification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, Notification[T]]]
}
