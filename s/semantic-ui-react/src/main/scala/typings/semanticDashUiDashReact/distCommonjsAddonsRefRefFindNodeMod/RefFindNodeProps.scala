package typings.semanticDashUiDashReact.distCommonjsAddonsRefRefFindNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefFindNodeProps
  extends StrictRefFindNodeProps
     with /* key */ StringDictionary[js.Any]

object RefFindNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactElement = null,
    innerRef: Ref[_] = null
  ): RefFindNodeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefFindNodeProps]
  }
}

