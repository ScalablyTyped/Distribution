package typings.rascal.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerAsPromisedClass extends EventEmitter {
  val config: BrokerConfig = js.native
  def bounce(): js.Promise[Unit] = js.native
  def connect(name: String): js.Promise[_] = js.native
  def forward(name: String, message: js.Any): js.Promise[PublishEventemitter] = js.native
  def forward(name: String, message: js.Any, overrides: String): js.Promise[PublishEventemitter] = js.native
  def forward(name: String, message: js.Any, overrides: PublicationConfig): js.Promise[PublishEventemitter] = js.native
  def nuke(): js.Promise[Unit] = js.native
  def publish(name: String, message: js.Any): js.Promise[PublishEventemitter] = js.native
  def publish(name: String, message: js.Any, overrides: String): js.Promise[PublishEventemitter] = js.native
  def publish(name: String, message: js.Any, overrides: PublicationConfig): js.Promise[PublishEventemitter] = js.native
  def purge(): js.Promise[Unit] = js.native
  def shutdown(): js.Promise[Unit] = js.native
  def subscribe(name: String): js.Promise[SubscriptionSession] = js.native
  def subscribe(name: String, overrides: SubscriptionConfig): js.Promise[SubscriptionSession] = js.native
  def unsubscribeAll(): js.Promise[Unit] = js.native
}

