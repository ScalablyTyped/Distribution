package typings.statsdClient

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.statsdClient.mod.ExpressMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait GetExpressMiddleware extends js.Object {
    
    def getExpressMiddleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: js.UndefOr[scala.Nothing], options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
}
