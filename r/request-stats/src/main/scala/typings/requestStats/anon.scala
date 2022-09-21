package typings.requestStats

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bytes extends StObject {
    
    /**
      * Number of bytes sent by the client
      */
    var bytes: Double
    
    /**
      * The headers sent by the client
      */
    var headers: IncomingHttpHeaders
    
    /**
      * The remote ip
      */
    var ip: String
    
    /**
      * The HTTP method used by the client
      */
    var method: String
    
    /**
      * The path part of the request URL
      */
    var path: String
    
    /**
      * The original `http.IncomingMessage` object
      */
    var raw: IncomingMessage
  }
  object Bytes {
    
    inline def apply(
      bytes: Double,
      headers: IncomingHttpHeaders,
      ip: String,
      method: String,
      path: String,
      raw: IncomingMessage
    ): Bytes = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    extension [Self <: Bytes](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: IncomingMessage): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesDelta extends StObject {
    
    /**
      * Total bytes received
      */
    var bytes: Double
    
    /**
      * Bytes received since previous call to `.progress()`
      */
    var bytesDelta: Double
    
    /**
      * If the request contains a Content-Size header
      */
    var bytesLeft: Double
    
    /**
      * Bytes per second calculated since previous call to `.progress()`
      */
    var speed: Double
    
    /**
      * If the request contains a Content-Size header
      */
    var timeLeft: Double
  }
  object BytesDelta {
    
    inline def apply(bytes: Double, bytesDelta: Double, bytesLeft: Double, speed: Double, timeLeft: Double): BytesDelta = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], bytesLeft = bytesLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesDelta]
    }
    
    extension [Self <: BytesDelta](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setBytesDelta(value: Double): Self = StObject.set(x, "bytesDelta", value.asInstanceOf[js.Any])
      
      inline def setBytesLeft(value: Double): Self = StObject.set(x, "bytesLeft", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    /**
      * Number of bytes sent back to the client
      */
    var bytes: Double
    
    /**
      * The headers sent back to the client
      */
    var headers: OutgoingHttpHeaders
    
    /**
      * The original `http.ServerResponse` object
      */
    var raw: ServerResponse[IncomingMessage]
    
    /**
      * The HTTP status code returned to the client
      */
    var status: Double
  }
  object Headers {
    
    inline def apply(bytes: Double, headers: OutgoingHttpHeaders, raw: ServerResponse[IncomingMessage], status: Double): Headers = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Speed extends StObject {
    
    /**
      * Total bytes send back to the client
      */
    var bytes: Double
    
    /**
      * Bytes sent back to the client since previous call to `.progress()`
      */
    var bytesDelta: Double
    
    /**
      * Bytes per second calculated since previous call to `.progress()`
      */
    var speed: Double
  }
  object Speed {
    
    inline def apply(bytes: Double, bytesDelta: Double, speed: Double): Speed = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Speed]
    }
    
    extension [Self <: Speed](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setBytesDelta(value: Double): Self = StObject.set(x, "bytesDelta", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    }
  }
}
