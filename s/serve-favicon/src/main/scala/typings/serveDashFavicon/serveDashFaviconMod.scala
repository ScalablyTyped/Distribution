package typings.serveDashFavicon

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object serveDashFaviconMod extends js.Object {
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: String): RequestHandler[ParamsDictionary] = js.native
  def apply(path: String, options: Anon_MaxAge): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer): RequestHandler[ParamsDictionary] = js.native
  def apply(path: Buffer, options: Anon_MaxAge): RequestHandler[ParamsDictionary] = js.native
}

