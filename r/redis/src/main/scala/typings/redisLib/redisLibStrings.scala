package typings
package redisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object redisLibStrings {
  @js.native
  sealed trait AFTER extends js.Object
  
  @js.native
  sealed trait BEFORE extends js.Object
  
  @js.native
  sealed trait OK extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait message_buffer extends js.Object
  
  @js.native
  sealed trait pmessage extends js.Object
  
  @js.native
  sealed trait pmessage_buffer extends js.Object
  
  @js.native
  sealed trait psubscribe extends js.Object
  
  @js.native
  sealed trait punsubscribe extends js.Object
  
  @js.native
  sealed trait subscribe extends js.Object
  
  @js.native
  sealed trait unsubscribe extends js.Object
  
  def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  def OK: OK = "OK".asInstanceOf[OK]
  def message: message = "message".asInstanceOf[message]
  def message_buffer: message_buffer = "message_buffer".asInstanceOf[message_buffer]
  def pmessage: pmessage = "pmessage".asInstanceOf[pmessage]
  def pmessage_buffer: pmessage_buffer = "pmessage_buffer".asInstanceOf[pmessage_buffer]
  def psubscribe: psubscribe = "psubscribe".asInstanceOf[psubscribe]
  def punsubscribe: punsubscribe = "punsubscribe".asInstanceOf[punsubscribe]
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}

