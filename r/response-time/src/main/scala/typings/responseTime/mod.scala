package typings.responseTime

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  inline def apply(): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse[IncomingMessage], 
    /* callback */ js.Function1[/* err */ Any, Unit], 
    Any
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse[IncomingMessage], 
    /* callback */ js.Function1[/* err */ Any, Unit], 
    Any
  ]]
  inline def apply(
    fn: js.Function3[
      /* request */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* response */ Response_[Any, Record[String, Any]], 
      /* time */ Double, 
      Any
    ]
  ): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse[IncomingMessage], 
    /* callback */ js.Function1[/* err */ Any, Unit], 
    Any
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse[IncomingMessage], 
    /* callback */ js.Function1[/* err */ Any, Unit], 
    Any
  ]]
  
  @JSImport("response-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ResponseTimeFunction = js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse[IncomingMessage], 
    /* time */ Double, 
    Any
  ]
  
  trait ResponseTimeOptions extends StObject {
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[Boolean] = js.undefined
  }
  object ResponseTimeOptions {
    
    inline def apply(): ResponseTimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseTimeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseTimeOptions] (val x: Self) extends AnyVal {
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
