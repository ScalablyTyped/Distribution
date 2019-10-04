package typings.sauronjs.coreComponentMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  def attr(key: String): String = js.native
  def attr(key: String, value: String): Unit = js.native
  def broadcast(event: String, data: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  def registerSubscription(
    subscriptions: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Subscription */ _
    ]
  ): Unit = js.native
  def subscribe(
    observables: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): Unit = js.native
}

