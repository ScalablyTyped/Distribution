package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type delType = js.Function3[
    /* path */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type errorType = js.Function3[
    /* name */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type getType = js.Function3[
    /* path */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type postType = js.Function3[
    /* path */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type putType = js.Function3[
    /* path */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type socketType = js.Function3[
    /* name */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
  type subType = js.Function3[
    /* subdomain */ java.lang.String, 
    /* middlewares */ serverLib.typingsCommonMod.Middleware | serverLib.typingsCommonMod.Middlewares, 
    /* all */ serverLib.typingsCommonMod.Middlewares, 
    serverLib.typingsCommonMod.Middleware
  ]
}
