package typings.rxjs

import typings.rxjs.notificationMod.Notification
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/dematerialize", JSImport.Namespace)
@js.native
object dematerializeMod extends js.Object {
  
  def dematerialize[T](): OperatorFunction[Notification[T], T] = js.native
}
