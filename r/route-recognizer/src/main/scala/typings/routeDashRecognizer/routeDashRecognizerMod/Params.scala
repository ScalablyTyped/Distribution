package typings.routeDashRecognizer.routeDashRecognizerMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.routeDashRecognizer.distRouteDashRecognizerDslMod.Opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ StringDictionary[Opaque]
     with /* key */ NumberDictionary[Opaque] {
  var queryParams: js.UndefOr[QueryParams | Null] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ NumberDictionary[Opaque] = null,
    StringDictionary: /* key */ StringDictionary[Opaque] = null,
    queryParams: QueryParams = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

