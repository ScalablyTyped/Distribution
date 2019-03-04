package typings
package router5DashTransitionDashPathLib.typesTransitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var meta: js.UndefOr[router5DashTransitionDashPathLib.Anon_Key] = js.undefined
  var name: java.lang.String
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object State {
  @scala.inline
  def apply(
    name: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    meta: router5DashTransitionDashPathLib.Anon_Key = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): State = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[State]
  }
}

