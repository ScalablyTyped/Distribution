package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapRequest extends js.Object {
  var credentials: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var url: java.lang.String
}

object MapRequest {
  @scala.inline
  def apply(
    url: java.lang.String,
    credentials: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): MapRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[MapRequest]
  }
}

