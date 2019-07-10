package typings
package reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAACall[S, P, M] extends js.Object {
  var bailout: js.UndefOr[js.Function1[/* state */ S, scala.Boolean]] = js.undefined
  var body: js.UndefOr[
    (js.Function1[/* state */ S, stdLib.BodyInit | scala.Null]) | stdLib.BodyInit | scala.Null
  ] = js.undefined
  var credentials: js.UndefOr[stdLib.RequestCredentials] = js.undefined
  var fetch: js.UndefOr[reduxDashApiDashMiddlewareLib.Fn_Init] = js.undefined
  var headers: js.UndefOr[js.Function1[/* state */ S, stdLib.HeadersInit]] = js.undefined
  var method: java.lang.String
  var ok: js.UndefOr[js.Function1[/* res */ stdLib.Response, scala.Boolean]] = js.undefined
  var options: js.UndefOr[js.Function1[/* state */ S, stdLib.RequestInit]] = js.undefined
  var types: js.Tuple3[
    java.lang.String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
    java.lang.String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
    java.lang.String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
  ]
  def endpoint(state: S): java.lang.String
}

object RSAACall {
  @scala.inline
  def apply[S, P, M](
    endpoint: S => java.lang.String,
    method: java.lang.String,
    types: js.Tuple3[
      java.lang.String | js.Symbol | (RSAARequestTypeDescriptor[S, P, M]), 
      java.lang.String | js.Symbol | (RSAASuccessTypeDescriptor[S, P, M]), 
      java.lang.String | js.Symbol | (RSAAFailureTypeDescriptor[S, P, M])
    ],
    bailout: /* state */ S => scala.Boolean = null,
    body: (js.Function1[/* state */ S, stdLib.BodyInit | scala.Null]) | stdLib.BodyInit = null,
    credentials: stdLib.RequestCredentials = null,
    fetch: reduxDashApiDashMiddlewareLib.Fn_Init = null,
    headers: /* state */ S => stdLib.HeadersInit = null,
    ok: /* res */ stdLib.Response => scala.Boolean = null,
    options: /* state */ S => stdLib.RequestInit = null
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

