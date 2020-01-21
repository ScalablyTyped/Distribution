package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload
  extends /* key */ StringDictionary[js.Any] {
  var query: js.UndefOr[Query] = js.undefined
}

object Payload {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, query: Query = null): Payload = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

