package typings.router5TransitionPath.transitionPathMod

import org.scalablytyped.runtime.StringDictionary
import typings.router5TransitionPath.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State
  extends /* key */ StringDictionary[js.Any] {
  var meta: js.UndefOr[AnonKey] = js.undefined
  var name: String
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object State {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    meta: AnonKey = null,
    params: StringDictionary[js.Any] = null
  ): State = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

