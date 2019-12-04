package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
@js.native
class AjaxSubscriber[T] protected ()
  extends typings.rxjs.internalObservableDomAjaxObservableMod.AjaxSubscriber[T] {
  def this(destination: typings.rxjs.internalSubscriberMod.Subscriber[T], request: AjaxRequest) = this()
}

