package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefForwardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefForwardProps
  extends StrictRefForwardProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RefForwardProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null
  ): RefForwardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefForwardProps]
  }
}

