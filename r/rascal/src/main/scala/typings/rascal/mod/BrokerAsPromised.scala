package typings.rascal.mod

import typings.amqplib.mod.Connection
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rascal", "BrokerAsPromised")
@js.native
class BrokerAsPromised protected () extends EventEmitter {
  def this(broker: Broker) = this()
  val config: BrokerConfig = js.native
  def bounce(): js.Promise[Unit] = js.native
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
  def subscribe(name: String): js.Promise[SubscriptionSession] = js.native
  def subscribe(name: String, overrides: SubscriptionConfig): js.Promise[SubscriptionSession] = js.native
  def subscribeAll(): js.Promise[js.Array[SubscriptionSession]] = js.native
  def subscribeAll(filter: String): js.Promise[js.Array[SubscriptionSession]] = js.native
  def unsubscribeAll(): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("rascal", "BrokerAsPromised")
@js.native
object BrokerAsPromised extends js.Object {
  def create(config: BrokerConfig): js.Promise[BrokerAsPromised] = js.native
  def create(config: BrokerConfig, components: js.Any): js.Promise[BrokerAsPromised] = js.native
}

