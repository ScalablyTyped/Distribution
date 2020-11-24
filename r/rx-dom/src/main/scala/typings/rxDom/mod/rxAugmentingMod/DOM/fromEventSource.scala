package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.rx.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.fromEventSource")
@js.native
object fromEventSource extends js.Object {
  
  // Server-Sent Events
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, openObservable: Observer[T]): Observable[T] = js.native
}
