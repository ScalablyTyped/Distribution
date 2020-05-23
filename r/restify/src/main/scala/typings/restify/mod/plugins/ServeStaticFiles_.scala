package typings.restify.mod.plugins

import typings.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeStaticFiles_ extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.undefined
}

object ServeStaticFiles_ {
  @scala.inline
  def apply(
    etag: String = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    setHeaders: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _ = null
  ): ServeStaticFiles_ = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
    __obj.asInstanceOf[ServeStaticFiles_]
  }
}

