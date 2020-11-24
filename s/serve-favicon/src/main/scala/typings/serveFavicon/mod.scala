package typings.serveFavicon

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.serveFavicon.anon.MaxAge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: String, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(path: Buffer, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
