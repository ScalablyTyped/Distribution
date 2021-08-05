package typings.sipJs

import typings.sipJs.coreExceptionsMod.TransportError
import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.messagesMod.IncomingResponseMessage
import typings.sipJs.transactionStateMod.TransactionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionUserMod {
  
  trait ClientTransactionUser
    extends StObject
       with TransactionUser {
    
    /**
      * Callback for request timeout error.
      *
      * When a timeout error is received from the transaction layer, it MUST be
      * treated as if a 408 (Request Timeout) status code has been received.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
      * TU MUST be informed of a timeout.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
      */
    var onRequestTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback for delegation of valid response handling.
      *
      * Valid responses are passed up to the TU from the client transaction.
      * https://tools.ietf.org/html/rfc3261#section-17.1
      */
    var receiveResponse: js.UndefOr[js.Function1[/* response */ IncomingResponseMessage, Unit]] = js.undefined
  }
  object ClientTransactionUser {
    
    inline def apply(loggerFactory: LoggerFactory): ClientTransactionUser = {
      val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientTransactionUser]
    }
    
    extension [Self <: ClientTransactionUser](x: Self) {
      
      inline def setOnRequestTimeout(value: () => Unit): Self = StObject.set(x, "onRequestTimeout", js.Any.fromFunction0(value))
      
      inline def setOnRequestTimeoutUndefined: Self = StObject.set(x, "onRequestTimeout", js.undefined)
      
      inline def setReceiveResponse(value: /* response */ IncomingResponseMessage => Unit): Self = StObject.set(x, "receiveResponse", js.Any.fromFunction1(value))
      
      inline def setReceiveResponseUndefined: Self = StObject.set(x, "receiveResponse", js.undefined)
    }
  }
  
  type ServerTransactionUser = TransactionUser
  
  trait TransactionUser extends StObject {
    
    /**
      * Logger factory.
      */
    var loggerFactory: LoggerFactory
    
    /**
      * Callback for notification of transaction state changes.
      *
      * Not called when transaction is constructed, so there is
      * no notification of entering the initial transaction state.
      * Otherwise, called once for each transaction state change.
      * State changes adhere to the following RFCs.
      * https://tools.ietf.org/html/rfc3261#section-17
      * https://tools.ietf.org/html/rfc6026
      */
    var onStateChange: js.UndefOr[js.Function1[/* newState */ TransactionState, Unit]] = js.undefined
    
    /**
      * Callback for notification of a transport error.
      *
      * If a fatal transport error is reported by the transport layer
      * (generally, due to fatal ICMP errors in UDP or connection failures in
      * TCP), the condition MUST be treated as a 503 (Service Unavailable)
      * status code.
      * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
      * https://tools.ietf.org/html/rfc3261#section-17.1.4
      * https://tools.ietf.org/html/rfc3261#section-17.2.4
      * https://tools.ietf.org/html/rfc6026
      */
    var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.undefined
  }
  object TransactionUser {
    
    inline def apply(loggerFactory: LoggerFactory): TransactionUser = {
      val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionUser]
    }
    
    extension [Self <: TransactionUser](x: Self) {
      
      inline def setLoggerFactory(value: LoggerFactory): Self = StObject.set(x, "loggerFactory", value.asInstanceOf[js.Any])
      
      inline def setOnStateChange(value: /* newState */ TransactionState => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOnTransportError(value: /* error */ TransportError => Unit): Self = StObject.set(x, "onTransportError", js.Any.fromFunction1(value))
      
      inline def setOnTransportErrorUndefined: Self = StObject.set(x, "onTransportError", js.undefined)
    }
  }
}
