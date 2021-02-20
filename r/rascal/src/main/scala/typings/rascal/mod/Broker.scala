package typings.rascal.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "Broker")
@js.native
class Broker () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def bounce(next: ErrorCb): Unit = js.native
  
  val config: BrokerConfig = js.native
  
  def connect(name: String, next: ConnectCb): Unit = js.native
  
  def forward(name: String, message: js.Any, next: Cb[Error, PublicationSession]): Unit = js.native
  def forward(name: String, message: js.Any, overrides: String, next: Cb[Error, PublicationSession]): Unit = js.native
  def forward(name: String, message: js.Any, overrides: PublicationConfig, next: Cb[Error, PublicationSession]): Unit = js.native
  
  def nuke(next: ErrorCb): Unit = js.native
  
  def publish(name: String, message: js.Any, next: Cb[Error, PublicationSession]): Unit = js.native
  def publish(name: String, message: js.Any, overrides: String, next: Cb[Error, PublicationSession]): Unit = js.native
  def publish(name: String, message: js.Any, overrides: PublicationConfig, next: Cb[Error, PublicationSession]): Unit = js.native
  
  def purge(next: ErrorCb): Unit = js.native
  
  def shutdown(next: ErrorCb): Unit = js.native
  
  def subscribe(name: String, next: Cb[Error, SubscriptionSession]): Unit = js.native
  def subscribe(name: String, overrides: String, next: Cb[Error, SubscriptionSession]): Unit = js.native
  def subscribe(name: String, overrides: SubscriptionConfig, next: Cb[Error, SubscriptionSession]): Unit = js.native
  
  def subscribeAll(
    filter: js.Function1[/* config */ SubscriptionConfig, Boolean],
    next: Cb[Error, js.Array[SubscriptionSession]]
  ): Unit = js.native
  def subscribeAll(next: Cb[Error, js.Array[SubscriptionSession]]): Unit = js.native
  
  def unsubscribeAll(next: ErrorCb): Unit = js.native
}
object Broker {
  
  /* static member */
  @JSImport("rascal", "Broker.create")
  @js.native
  def create(config: BrokerConfig, components: js.Any, next: CreateCb): Unit = js.native
  /* static member */
  @JSImport("rascal", "Broker.create")
  @js.native
  def create(config: BrokerConfig, next: CreateCb): Unit = js.native
}
