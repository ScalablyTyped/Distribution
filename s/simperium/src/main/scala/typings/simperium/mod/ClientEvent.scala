package typings.simperium.mod

import typings.simperium.simperiumInts.`0`
import typings.simperium.simperiumInts.`1`
import typings.simperium.simperiumInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEvent
  extends StObject
     with SimperiumEvent {
  
  def `access-token`(token: String): Unit
  
  def close(): Unit
  
  def connect(): Unit
  
  def disconnect(): Unit
  
  def error(error: js.Error): Unit
  
  def message(message: String): Unit
  
  @JSName("message:h")
  def messageColonh(count: Double): Unit
  
  @JSName("message:log")
  def messageColonlog(logLevel: `0` | `1` | `2`): Unit
  
  def reconnect(attempt: Double): Unit
  
  def send(msg: String): Unit
  
  def unauthorized(details: FailedAuthDetails): Unit
}
object ClientEvent {
  
  inline def apply(
    `access-token`: String => Unit,
    close: () => Unit,
    connect: () => Unit,
    disconnect: () => Unit,
    error: js.Error => Unit,
    message: String => Unit,
    messageColonh: Double => Unit,
    messageColonlog: `0` | `1` | `2` => Unit,
    reconnect: Double => Unit,
    send: String => Unit,
    unauthorized: FailedAuthDetails => Unit
  ): ClientEvent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), reconnect = js.Any.fromFunction1(reconnect), send = js.Any.fromFunction1(send), unauthorized = js.Any.fromFunction1(unauthorized))
    __obj.updateDynamic("access-token")(js.Any.fromFunction1(`access-token`))
    __obj.updateDynamic("message:h")(js.Any.fromFunction1(messageColonh))
    __obj.updateDynamic("message:log")(js.Any.fromFunction1(messageColonlog))
    __obj.asInstanceOf[ClientEvent]
  }
  
  extension [Self <: ClientEvent](x: Self) {
    
    inline def `setAccess-token`(value: String => Unit): Self = StObject.set(x, "access-token", js.Any.fromFunction1(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setMessage(value: String => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageColonh(value: Double => Unit): Self = StObject.set(x, "message:h", js.Any.fromFunction1(value))
    
    inline def setMessageColonlog(value: `0` | `1` | `2` => Unit): Self = StObject.set(x, "message:log", js.Any.fromFunction1(value))
    
    inline def setReconnect(value: Double => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction1(value))
    
    inline def setSend(value: String => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setUnauthorized(value: FailedAuthDetails => Unit): Self = StObject.set(x, "unauthorized", js.Any.fromFunction1(value))
  }
}
