package typings.rascal.mod

import typings.amqplib.mod.Connection
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "BrokerAsPromised")
@js.native
open class BrokerAsPromised protected () extends EventEmitter {
  def this(broker: Broker) = this()
  
  def bounce(): js.Promise[Unit] = js.native
  
  val config: BrokerConfig = js.native
  
  def connect(name: String): js.Promise[Connection] = js.native
  
  def forward(name: String, message: Any): js.Promise[PublicationSession] = js.native
  def forward(name: String, message: Any, overrides: String): js.Promise[PublicationSession] = js.native
  def forward(name: String, message: Any, overrides: PublicationConfig): js.Promise[PublicationSession] = js.native
  
  def nuke(): js.Promise[Unit] = js.native
  
  def publish(name: String, message: Any): js.Promise[PublicationSession] = js.native
  def publish(name: String, message: Any, overrides: String): js.Promise[PublicationSession] = js.native
  def publish(name: String, message: Any, overrides: PublicationConfig): js.Promise[PublicationSession] = js.native
  
  def purge(): js.Promise[Unit] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  
  def subscribe(name: String): js.Promise[SubscriberSessionAsPromised] = js.native
  def subscribe(name: String, overrides: SubscriptionConfig): js.Promise[SubscriberSessionAsPromised] = js.native
  
  def subscribeAll(): js.Promise[js.Array[SubscriberSessionAsPromised]] = js.native
  def subscribeAll(filter: js.Function1[/* config */ SubscriptionConfig, Boolean]): js.Promise[js.Array[SubscriberSessionAsPromised]] = js.native
  
  def unsubscribeAll(): js.Promise[Unit] = js.native
}
object BrokerAsPromised {
  
  @JSImport("rascal", "BrokerAsPromised")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(config: BrokerConfig): js.Promise[BrokerAsPromised] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BrokerAsPromised]]
  inline def create(config: BrokerConfig, components: Any): js.Promise[BrokerAsPromised] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BrokerAsPromised]]
}
