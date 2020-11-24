package typings.sqsConsumer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsConsumerStrings {
  
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def message_processed: message_processed = "message_processed".asInstanceOf[message_processed]
  
  @scala.inline
  def message_received: message_received = "message_received".asInstanceOf[message_received]
  
  @scala.inline
  def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  
  @scala.inline
  def response_processed: response_processed = "response_processed".asInstanceOf[response_processed]
  
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @scala.inline
  def timeout_error: timeout_error = "timeout_error".asInstanceOf[timeout_error]
  
  @js.native
  sealed trait empty extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait message_processed extends js.Object
  
  @js.native
  sealed trait message_received extends js.Object
  
  @js.native
  sealed trait processing_error extends js.Object
  
  @js.native
  sealed trait response_processed extends js.Object
  
  @js.native
  sealed trait stopped extends js.Object
  
  @js.native
  sealed trait timeout_error extends js.Object
}
