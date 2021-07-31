package typings.statsdClient

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.statsdClient.mod.ExpressMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetExpressMiddleware extends StObject {
    
    def getExpressMiddleware(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def getExpressMiddleware(prefix: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def getExpressMiddleware(prefix: Unit, options: ExpressMiddlewareOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  }
}
