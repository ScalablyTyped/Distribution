package typings.semanticDashUiDashReact.distCommonjsAddonsRefRefMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefProps
  extends StrictRefProps
     with /* key */ StringDictionary[js.Any]

object RefProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null,
    innerRef: typings.react.reactMod.Ref[_] = null
  ): RefProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefProps]
  }
}

