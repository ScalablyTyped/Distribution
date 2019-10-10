package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL
import typings.nodeDashFetch.externalsMod.AbortSignal
import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRequestInit
  extends SparqlHttpOptions
     with RequestInit

object QueryRequestInit {
  @scala.inline
  def apply(
    agent: Agent | (js.Function1[/* parsedUrl */ URL, Agent]) = null,
    body: BodyInit = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    endpointUrl: String = null,
    follow: Int | Double = null,
    headers: HeadersInit = null,
    method: String = null,
    redirect: RequestRedirect = null,
    signal: AbortSignal = null,
    size: Int | Double = null,
    timeout: Int | Double = null,
    updateUrl: String = null
  ): QueryRequestInit = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    __obj.asInstanceOf[QueryRequestInit]
  }
}

