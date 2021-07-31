package typings.serveFavicon

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.serveFavicon.anon.MaxAge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Node.js middleware for serving a favicon.
    */
  @scala.inline
  def apply(path: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(path: String, options: MaxAge): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(path: Buffer): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(path: Buffer, options: MaxAge): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("serve-favicon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
