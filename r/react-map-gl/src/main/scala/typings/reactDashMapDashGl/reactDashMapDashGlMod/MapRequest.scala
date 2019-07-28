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
    val __obj = js.Dynamic.literal(url = url)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[MapRequest]
  }
}

