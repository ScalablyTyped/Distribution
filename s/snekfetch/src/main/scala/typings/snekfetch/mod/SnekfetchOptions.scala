package typings.snekfetch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnekfetchOptions extends js.Object {
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  var data: js.UndefOr[js.Object | String | Buffer] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object | String] = js.undefined
  var redirect: js.UndefOr[Boolean] = js.undefined
}

object SnekfetchOptions {
  @scala.inline
  def apply(
    agent: Agent | Boolean = null,
    data: js.Object | String | Buffer = null,
    headers: StringDictionary[js.Any] = null,
    qs: js.Object = null,
    query: js.Object | String = null,
    redirect: js.UndefOr[Boolean] = js.undefined
  ): SnekfetchOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnekfetchOptions]
  }
}

