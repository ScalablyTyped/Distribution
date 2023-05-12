package typings.sqsConsumer

import typings.sqsConsumer.distTypesMod.UpdatableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsConsumerStrings {
  
  @js.native
  sealed trait aborted extends StObject
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait batchSize
    extends StObject
       with UpdatableOptions
  inline def batchSize: batchSize = "batchSize".asInstanceOf[batchSize]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
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
  sealed trait option_updated extends StObject
  inline def option_updated: option_updated = "option_updated".asInstanceOf[option_updated]
  
  @js.native
  sealed trait processing_error extends StObject
  inline def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  
  @js.native
  sealed trait response_processed extends StObject
  inline def response_processed: response_processed = "response_processed".asInstanceOf[response_processed]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait started extends StObject
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stopped extends StObject
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait timeout_error extends StObject
  inline def timeout_error: timeout_error = "timeout_error".asInstanceOf[timeout_error]
  
  @js.native
  sealed trait visibilityTimeout
    extends StObject
       with UpdatableOptions
  inline def visibilityTimeout: visibilityTimeout = "visibilityTimeout".asInstanceOf[visibilityTimeout]
  
  @js.native
  sealed trait waitTimeSeconds
    extends StObject
       with UpdatableOptions
  inline def waitTimeSeconds: waitTimeSeconds = "waitTimeSeconds".asInstanceOf[waitTimeSeconds]
}
