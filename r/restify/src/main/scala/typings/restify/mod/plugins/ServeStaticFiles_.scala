package typings.restify.mod.plugins

import typings.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeStaticFiles_ extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.native
}

object ServeStaticFiles_ {
  @scala.inline
  def apply(): ServeStaticFiles_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStaticFiles_]
  }
  @scala.inline
  implicit class ServeStaticFiles_Ops[Self <: ServeStaticFiles_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setSetHeaders(value: (/* res */ Response, /* path */ String, /* stat */ js.Any) => _): Self = this.set("setHeaders", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetHeaders: Self = this.set("setHeaders", js.undefined)
  }
  
}

