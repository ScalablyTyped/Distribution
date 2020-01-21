package typings.scBrokerCluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scBrokerClusterStrings {
  @js.native
  sealed trait brokerExit extends js.Object
  
  @js.native
  sealed trait brokerMessage extends js.Object
  
  @js.native
  sealed trait brokerStart extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  @scala.inline
  def brokerExit: brokerExit = "brokerExit".asInstanceOf[brokerExit]
  @scala.inline
  def brokerMessage: brokerMessage = "brokerMessage".asInstanceOf[brokerMessage]
  @scala.inline
  def brokerStart: brokerStart = "brokerStart".asInstanceOf[brokerStart]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

