package typings.rest.interceptorMod

import typings.rest.mod.Meta
import typings.rest.mod.Request
import typings.rest.mod.Response
import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[T, U] extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
  var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.native
  var request: js.UndefOr[
    js.Function3[/* request */ Request, /* config */ U, /* meta */ Meta, Request | Promise[Request]]
  ] = js.native
  var response: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
  var success: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.native
}

object Config {
  @scala.inline
  def apply[T, U](): Config[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T, U]]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config[_, _], T, U] (val x: Self with (Config[T, U])) extends AnyVal {
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
    def setError(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInit(value: /* config */ T => U): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setRequest(value: (/* request */ Request, /* config */ U, /* meta */ Meta) => Request | Promise[Request]): Self = this.set("request", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = this.set("response", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setSuccess(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

