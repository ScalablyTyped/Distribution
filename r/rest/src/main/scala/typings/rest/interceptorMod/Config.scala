package typings.rest.interceptorMod

import typings.rest.restMod.Meta
import typings.rest.restMod.Request
import typings.rest.restMod.Response
import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[T, U] extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.undefined
  var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.undefined
  var request: js.UndefOr[
    js.Function3[/* request */ Request, /* config */ U, /* meta */ Meta, Request | Promise[Request]]
  ] = js.undefined
  var response: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply[T, U](
    error: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response] = null,
    init: /* config */ T => U = null,
    request: (/* request */ Request, /* config */ U, /* meta */ Meta) => Request | Promise[Request] = null,
    response: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response] = null,
    success: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response] = null
  ): Config[T, U] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction3(response))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    __obj.asInstanceOf[Config[T, U]]
  }
}

