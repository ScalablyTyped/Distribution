package typings
package atStorybookApiLib.distModulesVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var info: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object Version {
  @scala.inline
  def apply(
    version: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    info: java.lang.String = null
  ): Version = {
    val __obj = js.Dynamic.literal(version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (info != null) __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[Version]
  }
}

