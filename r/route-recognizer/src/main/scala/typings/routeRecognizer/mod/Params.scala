package typings.routeRecognizer.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.routeRecognizer.dslMod.Opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ NumberDictionary[Opaque]
     with /* key */ StringDictionary[Opaque] {
  var queryParams: js.UndefOr[QueryParams | Null] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ NumberDictionary[Opaque] = null,
    StringDictionary: /* key */ StringDictionary[Opaque] = null,
    queryParams: js.UndefOr[Null | QueryParams] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(queryParams)) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

