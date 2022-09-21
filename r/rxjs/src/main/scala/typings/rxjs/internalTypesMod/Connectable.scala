package typings.rxjs.internalTypesMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connectable[T] extends Observable[T] {
  
  /**
    * (Idempotent) Calling this method will connect the underlying source observable to all subscribed consumers
    * through an underlying {@link Subject}.
    * @returns A subscription, that when unsubscribed, will "disconnect" the source from the connector subject,
    * severing notifications to all consumers.
    */
  def connect(): Subscription = js.native
}
