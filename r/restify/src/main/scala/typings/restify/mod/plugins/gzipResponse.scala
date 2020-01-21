package typings.restify.mod.plugins

import typings.node.zlibMod.ZlibOptions
import typings.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.gzipResponse")
@js.native
object gzipResponse extends js.Object {
  /**
    * gzips the response if client send `accept-encoding: gzip`
    * @param options options to pass to gzlib
    */
  def apply(): RequestHandler = js.native
  def apply(options: ZlibOptions): RequestHandler = js.native
}

