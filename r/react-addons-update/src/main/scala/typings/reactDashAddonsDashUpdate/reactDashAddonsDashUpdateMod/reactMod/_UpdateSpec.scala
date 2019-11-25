package typings.reactDashAddonsDashUpdate.reactDashAddonsDashUpdateMod.reactMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UpdateSpec extends js.Object

object _UpdateSpec {
  @scala.inline
  def UpdateSpecCommand($apply: /* value */ js.Any => _ = null, $merge: js.Object = null, $set: js.Any = null): _UpdateSpec = {
    val __obj = js.Dynamic.literal()
    if ($apply != null) __obj.updateDynamic("$apply")(js.Any.fromFunction1($apply))
    if ($merge != null) __obj.updateDynamic("$merge")($merge.asInstanceOf[js.Any])
    if ($set != null) __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateSpec]
  }
  @scala.inline
  def UpdateSpecPath(StringDictionary: /* key */ StringDictionary[UpdateSpec] = null): _UpdateSpec = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[_UpdateSpec]
  }
}

