package typings.pulumiCloud

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpServerMod {
  
  trait HttpServer extends StObject {
    
    val url: Output_[String]
  }
  object HttpServer {
    
    @JSImport("@pulumi/cloud/httpServer", "HttpServer")
    @js.native
    val ^ : HttpServerConstructor = js.native
    
    @scala.inline
    implicit class HttpServerMutableBuilder[Self <: HttpServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: Output_[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/httpServer", "HttpServer")
  @js.native
  class HttpServerCls protected ()
    extends StObject
       with HttpServer {
    /**
      * @param createRequestListener Function that, when called, will produce the [[requestListener]]
      * function that will be called for each http request to the server.  The function will be
      * called once when the module is loaded.  As such, it is a suitable place for expensive
      * computation (like setting up a set of routes).  The function returned can then utilize the
      * results of that computation.
      */
    def this(name: String, createRequestListener: RequestListenerFactory) = this()
    def this(name: String, createRequestListener: RequestListenerFactory, opts: ResourceOptions) = this()
    
    /* CompleteClass */
    override val url: Output_[String] = js.native
  }
  
  @js.native
  trait HttpServerConstructor
    extends StObject
       with /**
    * @param createRequestListener Function that, when called, will produce the [[requestListener]]
    * function that will be called for each http request to the server.  The function will be
    * called once when the module is loaded.  As such, it is a suitable place for expensive
    * computation (like setting up a set of routes).  The function returned can then utilize the
    * results of that computation.
    */
  Instantiable2[/* name */ String, /* createRequestListener */ RequestListenerFactory, HttpServer]
       with Instantiable3[
          /* name */ String, 
          /* createRequestListener */ RequestListenerFactory, 
          /* opts */ ResourceOptions, 
          HttpServer
        ]
  
  type RequestListenerFactory = js.Function0[js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]]
}
