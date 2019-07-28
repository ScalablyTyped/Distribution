package typings.semanticDashUiDashReact.distCommonjsAddonsRefRefForwardMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefForwardProps
  extends StrictRefForwardProps
     with /* key */ StringDictionary[js.Any]

object RefForwardProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactElement = null,
    innerRef: Ref[_] = null
  ): RefForwardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefForwardProps]
  }
}

