package typings
package routeDashRecognizerLib.routeDashRecognizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ org.scalablytyped.runtime.StringDictionary[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque] {
  var queryParams: js.UndefOr[QueryParams | scala.Null] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque] = null,
    queryParams: QueryParams = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Params]
  }
}

