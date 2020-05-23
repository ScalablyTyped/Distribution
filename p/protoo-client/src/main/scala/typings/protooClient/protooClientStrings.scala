package typings.protooClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object protooClientStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait notification extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
}

