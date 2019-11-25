package typings.qiniuDashJs.qiniuDashJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuDashJs.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedInfo extends /* key */ StringDictionary[Anon_Type | Double | String] {
  var code: Double
  var error: String
}

object ExtendedInfo {
  @scala.inline
  def apply(
    code: Double,
    error: String,
    StringDictionary: /* key */ StringDictionary[Anon_Type | Double | String] = null
  ): ExtendedInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtendedInfo]
  }
}

