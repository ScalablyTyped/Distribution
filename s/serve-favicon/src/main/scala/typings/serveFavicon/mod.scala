package typings.serveFavicon

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.serveFavicon.anon.MaxAge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Node.js middleware for serving a favicon.
    */
  @JSImport("serve-favicon", JSImport.Namespace)
  @js.native
  def apply(path: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("serve-favicon", JSImport.Namespace)
  @js.native
  def apply(path: String, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("serve-favicon", JSImport.Namespace)
  @js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("serve-favicon", JSImport.Namespace)
  @js.native
  def apply(path: Buffer, options: MaxAge): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
