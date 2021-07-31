package typings.server

import typings.server.commonMod.Middleware
import typings.server.commonMod.Middlewares
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("server/router", "del")
  @js.native
  val del: delType = js.native
  
  @JSImport("server/router", "error")
  @js.native
  val error: errorType = js.native
  
  @JSImport("server/router", "get")
  @js.native
  val get: getType = js.native
  
  @JSImport("server/router", "post")
  @js.native
  val post: postType = js.native
  
  @JSImport("server/router", "put")
  @js.native
  val put: putType = js.native
  
  @JSImport("server/router", "socket")
  @js.native
  val socket: socketType = js.native
  
  @JSImport("server/router", "sub")
  @js.native
  val sub: subType = js.native
  
  trait Router extends StObject {
    
    def del(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def del(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("del")
    var del_Original: delType
    
    def error(
      name: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def error(
      name: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("error")
    var error_Original: errorType
    
    def get(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def get(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("get")
    var get_Original: getType
    
    def post(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def post(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("post")
    var post_Original: postType
    
    def put(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def put(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("put")
    var put_Original: putType
    
    def socket(
      name: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def socket(
      name: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("socket")
    var socket_Original: socketType
    
    def sub(
      subdomain: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    def sub(
      subdomain: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware
    @JSName("sub")
    var sub_Original: subType
  }
  object Router {
    
    @scala.inline
    def apply(
      del: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      error: (/* name */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      get: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      post: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      put: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      socket: (/* name */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware,
      sub: (/* subdomain */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
    ): Router = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del), error = js.Any.fromFunction3(error), get = js.Any.fromFunction3(get), post = js.Any.fromFunction3(post), put = js.Any.fromFunction3(put), socket = js.Any.fromFunction3(socket), sub = js.Any.fromFunction3(sub))
      __obj.asInstanceOf[Router]
    }
    
    @scala.inline
    implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDel(
        value: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "del", js.Any.fromFunction3(value))
      
      @scala.inline
      def setError(
        value: (/* name */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGet(
        value: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPost(
        value: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "post", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPut(
        value: (/* path */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSocket(
        value: (/* name */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "socket", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSub(
        value: (/* subdomain */ String, /* middlewares */ Middleware | Middlewares, /* all */ Middlewares) => Middleware
      ): Self = StObject.set(x, "sub", js.Any.fromFunction3(value))
    }
  }
  
  type delType = js.Function3[
    /* path */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type errorType = js.Function3[
    /* name */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type getType = js.Function3[
    /* path */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type postType = js.Function3[
    /* path */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type putType = js.Function3[
    /* path */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type socketType = js.Function3[
    /* name */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
  
  type subType = js.Function3[
    /* subdomain */ String, 
    /* middlewares */ Middleware | Middlewares, 
    /* all */ Middlewares, 
    Middleware
  ]
}
