package typings.server

import typings.server.commonMod.Middleware
import typings.server.commonMod.Middlewares
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("server/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  
  val del: delType = js.native
  
  val error: errorType = js.native
  
  val get: getType = js.native
  
  val post: postType = js.native
  
  val put: putType = js.native
  
  val socket: socketType = js.native
  
  val sub: subType = js.native
  
  @js.native
  trait Router extends js.Object {
    
    def del(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def del(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("del")
    var del_Original: delType = js.native
    
    def error(
      name: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def error(
      name: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("error")
    var error_Original: errorType = js.native
    
    def get(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def get(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("get")
    var get_Original: getType = js.native
    
    def post(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def post(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("post")
    var post_Original: postType = js.native
    
    def put(
      path: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def put(
      path: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("put")
    var put_Original: putType = js.native
    
    def socket(
      name: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def socket(
      name: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("socket")
    var socket_Original: socketType = js.native
    
    def sub(
      subdomain: String,
      middlewares: Middleware,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    def sub(
      subdomain: String,
      middlewares: Middlewares,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param all because its type Middlewares is not an array type */ all: Middlewares
    ): Middleware = js.native
    @JSName("sub")
    var sub_Original: subType = js.native
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
