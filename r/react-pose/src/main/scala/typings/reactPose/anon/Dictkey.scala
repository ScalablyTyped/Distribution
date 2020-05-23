package typings.reactPose.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Any] = js.undefined
  var withParent: js.UndefOr[Boolean] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: js.Any = null,
    withParent: js.UndefOr[Boolean] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(withParent)) __obj.updateDynamic("withParent")(withParent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

