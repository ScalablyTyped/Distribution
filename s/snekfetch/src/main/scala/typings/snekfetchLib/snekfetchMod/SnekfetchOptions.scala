package typings
package snekfetchLib.snekfetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnekfetchOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent | scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Object | java.lang.String | nodeLib.Buffer] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
}

object SnekfetchOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent | scala.Boolean = null,
    data: js.Object | java.lang.String | nodeLib.Buffer = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    qs: js.Object = null,
    query: js.Object | java.lang.String = null,
    redirect: js.UndefOr[scala.Boolean] = js.undefined
  ): SnekfetchOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    __obj.asInstanceOf[SnekfetchOptions]
  }
}

