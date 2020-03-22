package typings.rdfjsFetchLite.mod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfjsFetchLite.FnCall
import typings.rdfjsFetchLite.PickparsersSinkMapEventEm
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends FormatsInit {
  var factory: DatasetCoreFactory[OutQuad, InQuad, D]
}

object FactoryInit {
  @scala.inline
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
    factory: DatasetCoreFactory[OutQuad, InQuad, D],
    formats: PickparsersSinkMapEventEm,
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    fetch: FnCall = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    window: js.Any = null
  ): FactoryInit[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
  }
}

