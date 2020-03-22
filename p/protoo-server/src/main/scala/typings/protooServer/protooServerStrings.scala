package typings.protooServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object protooServerStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connectionrequest extends js.Object
  
  @js.native
  sealed trait notification extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connectionrequest: connectionrequest = "connectionrequest".asInstanceOf[connectionrequest]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
}

