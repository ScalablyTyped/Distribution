package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import typings.restify.restifyMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeStaticFiles extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.undefined
}

object ServeStaticFiles {
  @scala.inline
  def apply(
    etag: String = null,
    maxAge: Int | Double = null,
    setHeaders: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _ = null
  ): ServeStaticFiles = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
    __obj.asInstanceOf[ServeStaticFiles]
  }
}

@JSImport("restify", "plugins.serveStaticFiles")
@js.native
object serveStaticFiles extends js.Object {
  /**
    * Used to serve static files from a given directory
    */
  def apply(dir: String): RequestHandler = js.native
  def apply(dir: String, options: ServeStaticFiles): RequestHandler = js.native
}

