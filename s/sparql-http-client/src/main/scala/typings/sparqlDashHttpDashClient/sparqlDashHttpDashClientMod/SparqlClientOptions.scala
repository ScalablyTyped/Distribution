package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.urlMod.URL
import typings.sparqlDashHttpDashClient.Typeoffetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlClientOptions extends SparqlHttpOptions {
  var URL: Instantiable1[/* input */ String, typings.node.urlMod.URL]
  var fetch: Typeoffetch
}

object SparqlClientOptions {
  @scala.inline
  def apply(
    URL: Instantiable1[/* input */ String, URL],
    fetch: Typeoffetch,
    endpointUrl: String = null,
    updateUrl: String = null
  ): SparqlClientOptions = {
    val __obj = js.Dynamic.literal(URL = URL, fetch = fetch)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    __obj.asInstanceOf[SparqlClientOptions]
  }
}

