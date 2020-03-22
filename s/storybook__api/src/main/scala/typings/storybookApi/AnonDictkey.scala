package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var hierarchyRootSeparator: RegExp
  var hierarchySeparator: RegExp
  var showRoots: js.UndefOr[Boolean] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    hierarchyRootSeparator: RegExp,
    hierarchySeparator: RegExp,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    showRoots: js.UndefOr[Boolean] = js.undefined
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(hierarchyRootSeparator = hierarchyRootSeparator.asInstanceOf[js.Any], hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(showRoots)) __obj.updateDynamic("showRoots")(showRoots.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

