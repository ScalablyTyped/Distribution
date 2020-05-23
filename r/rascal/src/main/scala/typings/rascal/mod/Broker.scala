package typings.rascal.mod

import typings.amqplib.mod.Connection
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rascal", "Broker")
@js.native
class Broker () extends EventEmitter {
  val config: BrokerConfig = js.native
  def bounce(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def connect(
    name: String,
    next: js.Function2[/* err */ js.UndefOr[Error], /* connection */ js.UndefOr[Connection], Unit]
  ): Unit = js.native
  def forward(
    name: String,
    message: js.Any,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def forward(
    name: String,
    message: js.Any,
    overrides: String,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def forward(
    name: String,
    message: js.Any,
    overrides: PublicationConfig,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def nuke(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def publish(
    name: String,
    message: js.Any,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def publish(
    name: String,
    message: js.Any,
    overrides: String,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def publish(
    name: String,
    message: js.Any,
    overrides: PublicationConfig,
    next: js.Function2[/* err */ Error, /* publication */ PublicationSession, Unit]
  ): Unit = js.native
  def purge(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def shutdown(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def subscribe(name: String, next: js.Function2[/* err */ Error, /* subscription */ SubscriptionSession, Unit]): Unit = js.native
  def subscribe(
    name: String,
    overrides: String,
    next: js.Function2[/* err */ Error, /* subscription */ SubscriptionSession, Unit]
  ): Unit = js.native
  def subscribe(
    name: String,
    overrides: SubscriptionConfig,
    next: js.Function2[/* err */ Error, /* subscription */ SubscriptionSession, Unit]
  ): Unit = js.native
  def subscribeAll(filter: String): Unit = js.native
  def subscribeAll(
    filter: String,
    next: js.Function2[/* err */ Error, /* results */ js.Array[SubscriptionSession], Unit]
  ): Unit = js.native
  def subscribeAll(next: js.Function2[/* err */ Error, /* results */ js.Array[SubscriptionSession], Unit]): Unit = js.native
  def unsubscribeAll(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

/* static members */
@JSImport("rascal", "Broker")
@js.native
object Broker extends js.Object {
  def create(
    config: BrokerConfig,
    components: js.Any,
    next: js.Function2[/* err */ js.UndefOr[Error], /* broker */ js.UndefOr[this.type], Unit]
  ): js.Any = js.native
  def create(config: BrokerConfig, next: js.Function2[/* err */ Error, /* broker */ this.type, Unit]): js.Any = js.native
}

