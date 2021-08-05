package typings.sqsConsumer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsConsumerStrings {
  
  @js.native
  sealed trait empty extends StObject
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait message_processed extends StObject
  inline def message_processed: message_processed = "message_processed".asInstanceOf[message_processed]
  
  @js.native
  sealed trait message_received extends StObject
  inline def message_received: message_received = "message_received".asInstanceOf[message_received]
  
  @js.native
  sealed trait processing_error extends StObject
  inline def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  
  @js.native
  sealed trait response_processed extends StObject
  inline def response_processed: response_processed = "response_processed".asInstanceOf[response_processed]
  
  @js.native
  sealed trait stopped extends StObject
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait timeout_error extends StObject
  inline def timeout_error: timeout_error = "timeout_error".asInstanceOf[timeout_error]
}
