package typings.socketIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object socketIoStrings {
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
}

