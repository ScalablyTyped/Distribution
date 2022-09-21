package typings.socketclusterServer

import typings.socketclusterServer.serversocketMod.^
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var expiresIn: Double
  }
  object Algorithm {
    
    inline def apply(expiresIn: Double): Algorithm = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Algorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Algorithms {
    
    inline def apply(): Algorithms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithms]
    }
    
    extension [Self <: Algorithms](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
    }
  }
  
  trait Binary extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var fin: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
  }
  object Binary {
    
    inline def apply(): Binary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binary]
    }
    
    extension [Self <: Binary](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFin(value: Boolean): Self = StObject.set(x, "fin", value.asInstanceOf[js.Any])
      
      inline def setFinUndefined: Self = StObject.set(x, "fin", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: Any
    
    var target: WebSocket
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: Any, target: WebSocket, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: Data
  }
  object Message {
    
    inline def apply(message: Data): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: Data): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait RejectOnFailedDelivery extends StObject {
    
    var rejectOnFailedDelivery: Boolean
  }
  object RejectOnFailedDelivery {
    
    inline def apply(rejectOnFailedDelivery: Boolean): RejectOnFailedDelivery = {
      val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
      __obj.asInstanceOf[RejectOnFailedDelivery]
    }
    
    extension [Self <: RejectOnFailedDelivery](x: Self) {
      
      inline def setRejectOnFailedDelivery(value: Boolean): Self = StObject.set(x, "rejectOnFailedDelivery", value.asInstanceOf[js.Any])
    }
  }
  
  trait Server extends StObject {
    
    var Server: typings.ws.mod.Server[WebSocket]
  }
  object Server {
    
    inline def apply(Server: typings.ws.mod.Server[WebSocket]): Server = {
      val __obj = js.Dynamic.literal(Server = Server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setServer(value: typings.ws.mod.Server[WebSocket]): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedAuthToken extends StObject {
    
    var signedAuthToken: String
  }
  object SignedAuthToken {
    
    inline def apply(signedAuthToken: String): SignedAuthToken = {
      val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedAuthToken]
    }
    
    extension [Self <: SignedAuthToken](x: Self) {
      
      inline def setSignedAuthToken(value: String): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait Socket extends StObject {
    
    var socket: ^
  }
  object Socket {
    
    inline def apply(socket: ^): Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    extension [Self <: Socket](x: Self) {
      
      inline def setSocket(value: ^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Warning extends StObject {
    
    var warning: js.Error
  }
  object Warning {
    
    inline def apply(warning: js.Error): Warning = {
      val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    extension [Self <: Warning](x: Self) {
      
      inline def setWarning(value: js.Error): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
