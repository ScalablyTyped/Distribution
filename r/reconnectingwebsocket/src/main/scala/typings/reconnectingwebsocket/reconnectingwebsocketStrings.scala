package typings.reconnectingwebsocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reconnectingwebsocketStrings {
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait open extends js.Object
}
