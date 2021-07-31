package typings.responseTime

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  @scala.inline
  def apply(): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    js.Any
  ]]
  @scala.inline
  def apply(
    fn: js.Function3[
      /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* response */ Response_[js.Any], 
      /* time */ Double, 
      js.Any
    ]
  ): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    js.Any
  ]]
  
  @JSImport("response-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ResponseTimeFunction = js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* time */ Double, 
    js.Any
  ]
  
  trait ResponseTimeOptions extends StObject {
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[Boolean] = js.undefined
  }
  object ResponseTimeOptions {
    
    @scala.inline
    def apply(): ResponseTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseTimeOptions]
    }
    
    @scala.inline
    implicit class ResponseTimeOptionsMutableBuilder[Self <: ResponseTimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
