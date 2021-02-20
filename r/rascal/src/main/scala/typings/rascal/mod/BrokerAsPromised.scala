package typings.rascal.mod

import typings.amqplib.mod.Connection
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "BrokerAsPromised")
@js.native
class BrokerAsPromised protected () extends EventEmitter {
  def this(broker: Broker) = this()
  
  def bounce(): js.Promise[Unit] = js.native
  
  val config: BrokerConfig = js.native
  
  def connect(name: String): js.Promise[Connection] = js.native
  
  def forward(name: String, message: js.Any): js.Promise[PublicationSession] = js.native
  def forward(name: String, message: js.Any, overrides: String): js.Promise[PublicationSession] = js.native
  def forward(name: String, message: js.Any, overrides: PublicationConfig): js.Promise[PublicationSession] = js.native
  
  def nuke(): js.Promise[Unit] = js.native
  
  def publish(name: String, message: js.Any): js.Promise[PublicationSession] = js.native
  def publish(name: String, message: js.Any, overrides: String): js.Promise[PublicationSession] = js.native
  def publish(name: String, message: js.Any, overrides: PublicationConfig): js.Promise[PublicationSession] = js.native
  
  def purge(): js.Promise[Unit] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  def subscribe(name: String): js.Promise[SubscriberSessionAsPromised] = js.native
  def subscribe(name: String, overrides: SubscriptionConfig): js.Promise[SubscriberSessionAsPromised] = js.native
  
  def subscribeAll(): js.Promise[js.Array[SubscriberSessionAsPromised]] = js.native
  def subscribeAll(filter: js.Function1[/* config */ SubscriptionConfig, Boolean]): js.Promise[js.Array[SubscriberSessionAsPromised]] = js.native
  
  def unsubscribeAll(): js.Promise[Unit] = js.native
}
object BrokerAsPromised {
  
  /* static member */
  @JSImport("rascal", "BrokerAsPromised.create")
  @js.native
  def create(config: BrokerConfig): js.Promise[BrokerAsPromised] = js.native
  @JSImport("rascal", "BrokerAsPromised.create")
  @js.native
  def create(config: BrokerConfig, components: js.Any): js.Promise[BrokerAsPromised] = js.native
}
