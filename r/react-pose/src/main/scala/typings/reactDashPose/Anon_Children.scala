package typings.reactDashPose

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Any] = js.undefined
  var withParent: js.UndefOr[Boolean] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: js.Any = null,
    withParent: js.UndefOr[Boolean] = js.undefined
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

