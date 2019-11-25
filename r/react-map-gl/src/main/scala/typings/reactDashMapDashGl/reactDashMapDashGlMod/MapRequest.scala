package typings.reactDashMapDashGl.reactDashMapDashGlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapRequest extends js.Object {
  var credentials: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var url: String
}

object MapRequest {
  @scala.inline
  def apply(url: String, credentials: String = null, headers: StringDictionary[String] = null): MapRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRequest]
  }
}

