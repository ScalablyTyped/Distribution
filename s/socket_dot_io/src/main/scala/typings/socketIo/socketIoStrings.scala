package typings.socketIo

import typings.socketIo.distSocketMod.DisconnectReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketIoStrings {
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait `client namespace disconnect`
    extends StObject
       with DisconnectReason
  inline def `client namespace disconnect`: `client namespace disconnect` = ("client namespace disconnect").asInstanceOf[`client namespace disconnect`]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait entries extends StObject
  inline def entries: entries = "entries".asInstanceOf[entries]
  
  @js.native
  sealed trait forEach extends StObject
  inline def forEach: forEach = "forEach".asInstanceOf[forEach]
  
  @js.native
  sealed trait `forced close`
    extends StObject
       with DisconnectReason
  inline def `forced close`: `forced close` = ("forced close").asInstanceOf[`forced close`]
  
  @js.native
  sealed trait `forced server close`
    extends StObject
       with DisconnectReason
  inline def `forced server close`: `forced server close` = ("forced server close").asInstanceOf[`forced server close`]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait has extends StObject
  inline def has: has = "has".asInstanceOf[has]
  
  @js.native
  sealed trait keys extends StObject
  inline def keys: keys = "keys".asInstanceOf[keys]
  
  @js.native
  sealed trait message extends StObject
  inline def message: message = "message".asInstanceOf[message]
  
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
  sealed trait `server namespace disconnect`
    extends StObject
       with DisconnectReason
  inline def `server namespace disconnect`: `server namespace disconnect` = ("server namespace disconnect").asInstanceOf[`server namespace disconnect`]
  
  @js.native
  sealed trait `server shutting down`
    extends StObject
       with DisconnectReason
  inline def `server shutting down`: `server shutting down` = ("server shutting down").asInstanceOf[`server shutting down`]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait size extends StObject
  inline def size: size = "size".asInstanceOf[size]
  
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
  
  @js.native
  sealed trait values extends StObject
  inline def values: values = "values".asInstanceOf[values]
}
