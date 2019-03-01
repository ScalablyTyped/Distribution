package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefProps
  extends StrictRefProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RefProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null
  ): RefProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefProps]
  }
}

