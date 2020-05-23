package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: RegExp
  var hierarchySeparator: RegExp
  var showRoots: js.UndefOr[Boolean] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    hierarchyRootSeparator: RegExp,
    hierarchySeparator: RegExp,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    showRoots: js.UndefOr[Boolean] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(showRoots)) __obj.updateDynamic("showRoots")(showRoots.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

