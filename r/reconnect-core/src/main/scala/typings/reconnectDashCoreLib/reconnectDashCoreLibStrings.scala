package typings
package reconnectDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reconnectDashCoreLibStrings {
  @js.native
  sealed trait backoff extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait exponential extends js.Object
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait fibonacci extends js.Object
  
  @js.native
  sealed trait reconnect extends js.Object
  
  def backoff: backoff = "backoff".asInstanceOf[backoff]
  def connect: connect = "connect".asInstanceOf[connect]
  def connection: connection = "connection".asInstanceOf[connection]
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  def error: error = "error".asInstanceOf[error]
  def exponential: exponential = "exponential".asInstanceOf[exponential]
  def fail: fail = "fail".asInstanceOf[fail]
  def fibonacci: fibonacci = "fibonacci".asInstanceOf[fibonacci]
  def reconnect: reconnect = "reconnect".asInstanceOf[reconnect]
}

