package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparqlHttpOptions extends js.Object {
  var endpointUrl: js.UndefOr[String] = js.undefined
  var updateUrl: js.UndefOr[String] = js.undefined
}

object SparqlHttpOptions {
  @scala.inline
  def apply(endpointUrl: String = null, updateUrl: String = null): SparqlHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlHttpOptions]
  }
}

