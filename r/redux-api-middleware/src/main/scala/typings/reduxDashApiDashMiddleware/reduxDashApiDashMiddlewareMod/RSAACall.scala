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
  var bailout: js.UndefOr[(js.Function1[/* state */ S, Boolean]) | Boolean] = js.undefined
  var body: js.UndefOr[(js.Function1[/* state */ S, BodyInit | Null]) | BodyInit | Null] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var endpoint: (js.Function1[/* state */ S, String]) | String
  var fetch: js.UndefOr[Fn_Init] = js.undefined
  var headers: js.UndefOr[(js.Function1[/* state */ S, HeadersInit]) | HeadersInit] = js.undefined
  var method: String
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
  var options: js.UndefOr[(js.Function1[/* state */ S, RequestInit]) | RequestInit] = js.undefined
  var types: js.Tuple3[
    String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
    String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
    String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
  ]
}

object RSAACall {
  @scala.inline
  def apply[S, P, M](
    endpoint: (js.Function1[/* state */ S, String]) | String,
    method: String,
    types: js.Tuple3[
      String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
      String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
      String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
    ],
    bailout: (js.Function1[/* state */ S, Boolean]) | Boolean = null,
    body: (js.Function1[/* state */ S, BodyInit | Null]) | BodyInit = null,
    credentials: RequestCredentials = null,
    fetch: Fn_Init = null,
    headers: (js.Function1[/* state */ S, HeadersInit]) | HeadersInit = null,
    ok: /* res */ Response => Boolean = null,
    options: (js.Function1[/* state */ S, RequestInit]) | RequestInit = null
  ): RSAACall[S, P, M] = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], method = method, types = types)
    if (bailout != null) __obj.updateDynamic("bailout")(bailout.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1(ok))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAACall[S, P, M]]
  }
}

