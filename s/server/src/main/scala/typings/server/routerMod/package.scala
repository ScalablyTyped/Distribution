package typings.server

import typings.server.typingsCommonMod.Middleware
import typings.server.typingsCommonMod.Middlewares
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
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
