package typings.socketIoClient

import typings.socketIoClient.buildEsmSocketMod.Socket.DisconnectReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketIoClientStrings {
  
  @js.native
  sealed trait closed extends StObject
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait `io client disconnect`
    extends StObject
       with DisconnectReason
  inline def `io client disconnect`: `io client disconnect` = ("io client disconnect").asInstanceOf[`io client disconnect`]
  
  @js.native
  sealed trait `io server disconnect`
    extends StObject
       with DisconnectReason
  inline def `io server disconnect`: `io server disconnect` = ("io server disconnect").asInstanceOf[`io server disconnect`]
  
  @js.native
  sealed trait open extends StObject
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait opening extends StObject
  inline def opening: opening = "opening".asInstanceOf[opening]
  
  @js.native
  sealed trait `parse error`
    extends StObject
       with DisconnectReason
  inline def `parse error`: `parse error` = ("parse error").asInstanceOf[`parse error`]
  
  @js.native
  sealed trait `ping timeout`
    extends StObject
       with DisconnectReason
  inline def `ping timeout`: `ping timeout` = ("ping timeout").asInstanceOf[`ping timeout`]
  
  @js.native
  sealed trait `transport close`
    extends StObject
       with DisconnectReason
  inline def `transport close`: `transport close` = ("transport close").asInstanceOf[`transport close`]
  
  @js.native
  sealed trait `transport error`
    extends StObject
       with DisconnectReason
  inline def `transport error`: `transport error` = ("transport error").asInstanceOf[`transport error`]
}
