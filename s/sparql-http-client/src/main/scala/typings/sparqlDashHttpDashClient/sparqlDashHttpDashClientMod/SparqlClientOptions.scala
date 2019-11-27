package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.urlMod.URL
import typings.sparqlDashHttpDashClient.Fn_Init
import typings.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlClientOptions extends SparqlHttpOptions {
  var URL: js.UndefOr[Instantiable1[/* input */ String, typings.node.urlMod.URL]] = js.undefined
  var defaultHeaders: js.UndefOr[HeadersInit] = js.undefined
  var fetch: js.UndefOr[Fn_Init] = js.undefined
}

object SparqlClientOptions {
  @scala.inline
  def apply(
    URL: Instantiable1[/* input */ String, URL] = null,
    defaultHeaders: HeadersInit = null,
    endpointUrl: String = null,
    fetch: Fn_Init = null,
    updateUrl: String = null
  ): SparqlClientOptions = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlClientOptions]
  }
}

