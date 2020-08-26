package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.anon.FnCall
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMiddlewareOptions extends js.Object {
  var fetch: js.UndefOr[FnCall] = js.native
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.native
}

object CreateMiddlewareOptions {
  @scala.inline
  def apply(): CreateMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMiddlewareOptions]
  }
  @scala.inline
  implicit class CreateMiddlewareOptionsOps[Self <: CreateMiddlewareOptions] (val x: Self) extends AnyVal {
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
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setOk(value: /* res */ Response => Boolean): Self = this.set("ok", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
  }
  
}

