package typings.rascal.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "Broker")
@js.native
open class Broker () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def bounce(next: ErrorCb): Unit = js.native
  
  val config: BrokerConfig = js.native
  
  def connect(name: String, next: ConnectCb): Unit = js.native
  
  def forward(name: String, message: Any, next: Cb[js.Error, PublicationSession]): Unit = js.native
  def forward(name: String, message: Any, overrides: String, next: Cb[js.Error, PublicationSession]): Unit = js.native
  def forward(name: String, message: Any, overrides: PublicationConfig, next: Cb[js.Error, PublicationSession]): Unit = js.native
  
  def nuke(next: ErrorCb): Unit = js.native
  
  def publish(name: String, message: Any, next: Cb[js.Error, PublicationSession]): Unit = js.native
  def publish(name: String, message: Any, overrides: String, next: Cb[js.Error, PublicationSession]): Unit = js.native
  def publish(name: String, message: Any, overrides: PublicationConfig, next: Cb[js.Error, PublicationSession]): Unit = js.native
  
  def purge(next: ErrorCb): Unit = js.native
  
  def shutdown(next: ErrorCb): Unit = js.native
  
  def subscribe(name: String, next: Cb[js.Error, SubscriptionSession]): Unit = js.native
  def subscribe(name: String, overrides: String, next: Cb[js.Error, SubscriptionSession]): Unit = js.native
  def subscribe(name: String, overrides: SubscriptionConfig, next: Cb[js.Error, SubscriptionSession]): Unit = js.native
  
  def subscribeAll(
    filter: js.Function1[/* config */ SubscriptionConfig, Boolean],
    next: Cb[js.Error, js.Array[SubscriptionSession]]
  ): Unit = js.native
  def subscribeAll(next: Cb[js.Error, js.Array[SubscriptionSession]]): Unit = js.native
  
  def unsubscribeAll(next: ErrorCb): Unit = js.native
}
object Broker {
  
  @JSImport("rascal", "Broker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(config: BrokerConfig, components: Any, next: CreateCb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], components.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def create(config: BrokerConfig, next: CreateCb): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
