package typings.router5DashTransitionDashPath.typesTransitionPathMod

import org.scalablytyped.runtime.StringDictionary
import typings.router5DashTransitionDashPath.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State
  extends /* key */ StringDictionary[js.Any] {
  var meta: js.UndefOr[Anon_Key] = js.undefined
  var name: String
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object State {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    meta: Anon_Key = null,
    params: StringDictionary[js.Any] = null
  ): State = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[State]
  }
}

