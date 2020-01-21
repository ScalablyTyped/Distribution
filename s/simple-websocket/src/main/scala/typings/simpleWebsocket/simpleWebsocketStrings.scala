package typings.simpleWebsocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object simpleWebsocketStrings {
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait listening extends js.Object
  
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def listening: listening = "listening".asInstanceOf[listening]
}

