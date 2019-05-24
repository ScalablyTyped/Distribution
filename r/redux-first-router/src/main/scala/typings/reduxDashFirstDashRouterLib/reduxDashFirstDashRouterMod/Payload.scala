package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var query: js.UndefOr[Query] = js.undefined
}

object Payload {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    query: Query = null
  ): Payload = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Payload]
  }
}

