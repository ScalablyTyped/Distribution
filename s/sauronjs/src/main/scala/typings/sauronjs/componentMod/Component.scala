package typings.sauronjs.componentMod

import typings.std.HTMLElement
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  def attr(key: String): String = js.native
  def attr(key: String, value: String): Unit = js.native
  
  def broadcast(event: String): Unit = js.native
  def broadcast(event: String, data: js.Any): Unit = js.native
  
  var broadcastSubject: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var element: HTMLElement = js.native
  
  def find(selector: String): HTMLElement = js.native
  
  def findAll(selector: String): NodeListOf[HTMLElement] = js.native
  
  def registerSubscription(
    subscriptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subscription */ _
    ]
  ): Unit = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  def subscribe(
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): Unit = js.native
}
