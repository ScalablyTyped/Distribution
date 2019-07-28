package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.reduxDashApiDashMiddleware.Fn_Init
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAACall[S, P, M] extends js.Object {
  var bailout: js.UndefOr[js.Function1[/* state */ S, Boolean]] = js.undefined
  var body: js.UndefOr[(js.Function1[/* state */ S, BodyInit | Null]) | BodyInit | Null] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var fetch: js.UndefOr[Fn_Init] = js.undefined
  var headers: js.UndefOr[js.Function1[/* state */ S, HeadersInit]] = js.undefined
  var method: String
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
  var options: js.UndefOr[js.Function1[/* state */ S, RequestInit]] = js.undefined
  var types: js.Tuple3[
    String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
    String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
    String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
  ]
  def endpoint(state: S): String
}

object RSAACall {
  @scala.inline
  def apply[S, P, M](
    endpoint: S => String,
    method: String,
    types: js.Tuple3[
      String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
      String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
      String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
    ],
    bailout: /* state */ S => Boolean = null,
    body: (js.Function1[/* state */ S, BodyInit | Null]) | BodyInit = null,
    credentials: RequestCredentials = null,
    fetch: Fn_Init = null,
    headers: /* state */ S => HeadersInit = null,
    ok: /* res */ Response => Boolean = null,
    options: /* state */ S => RequestInit = null
  ): RSAACall[S, P, M] = {
    val __obj = js.Dynamic.literal(endpoint = js.Any.fromFunction1(endpoint), method = method, types = types)
    if (bailout != null) __obj.updateDynamic("bailout")(js.Any.fromFunction1(bailout))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (headers != null) __obj.updateDynamic("headers")(js.Any.fromFunction1(headers))
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1(ok))
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction1(options))
    __obj.asInstanceOf[RSAACall[S, P, M]]
  }
}

