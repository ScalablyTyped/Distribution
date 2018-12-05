package typings
package scDashBrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scDashBrokerLibStrings {
  @js.native
  sealed trait brokerMessage extends js.Object
  
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait exit extends js.Object
  
  @js.native
  sealed trait masterMessage extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait publish extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait subscribe extends js.Object
  
  @js.native
  sealed trait subscribeFail extends js.Object
  
  @js.native
  sealed trait unsubscribe extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  def brokerMessage: brokerMessage = "brokerMessage".asInstanceOf[brokerMessage]
  def connected: connected = "connected".asInstanceOf[connected]
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  def error: error = "error".asInstanceOf[error]
  def exit: exit = "exit".asInstanceOf[exit]
  def masterMessage: masterMessage = "masterMessage".asInstanceOf[masterMessage]
  def message: message = "message".asInstanceOf[message]
  def publish: publish = "publish".asInstanceOf[publish]
  def ready: ready = "ready".asInstanceOf[ready]
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  def subscribeFail: subscribeFail = "subscribeFail".asInstanceOf[subscribeFail]
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  def warning: warning = "warning".asInstanceOf[warning]
}

