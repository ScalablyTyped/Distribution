package typings.atStorybookApi.distModulesVersionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version
  extends /* key */ StringDictionary[js.Any] {
  var info: js.UndefOr[String] = js.undefined
  var version: String
}

object Version {
  @scala.inline
  def apply(version: String, StringDictionary: /* key */ StringDictionary[js.Any] = null, info: String = null): Version = {
    val __obj = js.Dynamic.literal(version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[Version]
  }
}

