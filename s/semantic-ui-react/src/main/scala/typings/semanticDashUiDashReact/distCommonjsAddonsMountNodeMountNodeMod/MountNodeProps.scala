package typings.semanticDashUiDashReact.distCommonjsAddonsMountNodeMountNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountNodeProps
  extends StrictMountNodeProps
     with /* key */ StringDictionary[js.Any]

object MountNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    node: HTMLElement | Ref[_] = null
  ): MountNodeProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountNodeProps]
  }
}

