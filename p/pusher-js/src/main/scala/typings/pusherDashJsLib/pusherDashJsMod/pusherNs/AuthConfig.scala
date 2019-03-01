package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object AuthConfig {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AuthConfig = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[AuthConfig]
  }
}

