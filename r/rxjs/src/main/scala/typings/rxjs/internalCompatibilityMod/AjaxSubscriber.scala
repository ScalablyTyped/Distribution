package typings.rxjs.internalCompatibilityMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxSubscriber[T] {
  def this(destination: typings.rxjs.subscriberMod.Subscriber[T], request: AjaxRequest) = this()
}
