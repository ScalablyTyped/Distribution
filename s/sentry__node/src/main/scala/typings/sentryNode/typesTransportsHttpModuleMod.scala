package typings.sentryNode

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.sentryNode.sentryNodeStrings.data
import typings.sentryNode.sentryNodeStrings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsHttpModuleMod {
  
  @js.native
  trait HTTPModule extends StObject {
    
    /**
      * Request wrapper
      * @param options These are {@see TransportOptions}
      * @param callback Callback when request is finished
      */
    def request(options: HTTPModuleRequestOptions): Writable = js.native
    def request(
      options: HTTPModuleRequestOptions,
      callback: js.Function1[/* res */ HTTPModuleRequestIncomingMessage, Unit]
    ): Writable = js.native
  }
  
  trait HTTPModuleRequestIncomingMessage extends StObject {
    
    var headers: IncomingHttpHeaders
    
    def on(event: data | end, listener: js.Function0[Unit]): Unit
    
    def setEncoding(encoding: String): Unit
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object HTTPModuleRequestIncomingMessage {
    
    inline def apply(
      headers: IncomingHttpHeaders,
      on: (data | end, js.Function0[Unit]) => Unit,
      setEncoding: String => Unit
    ): HTTPModuleRequestIncomingMessage = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), setEncoding = js.Any.fromFunction1(setEncoding))
      __obj.asInstanceOf[HTTPModuleRequestIncomingMessage]
    }
    
    extension [Self <: HTTPModuleRequestIncomingMessage](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (data | end, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setSetEncoding(value: String => Unit): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type HTTPModuleRequestOptions = RequestOptions | typings.node.httpsMod.RequestOptions | String | URL_
}
