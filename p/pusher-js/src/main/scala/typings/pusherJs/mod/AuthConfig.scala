package typings.pusherJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AuthConfig {
  @scala.inline
  def apply(headers: StringDictionary[js.Any] = null, params: StringDictionary[js.Any] = null): AuthConfig = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthConfig]
  }
}

