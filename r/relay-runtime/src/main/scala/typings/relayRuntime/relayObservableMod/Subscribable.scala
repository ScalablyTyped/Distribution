package typings.relayRuntime.relayObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscribable[T] extends js.Object {
  
  def subscribe(observer: Observer[T]): Subscription = js.native
  def subscribe(observer: Sink[T]): Subscription = js.native
}
