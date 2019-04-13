package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefFindNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefFindNodeProps
  extends StrictRefFindNodeProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RefFindNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactElement[_] = null,
    innerRef: reactLib.reactMod.Ref[_] = null
  ): RefFindNodeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefFindNodeProps]
  }
}

