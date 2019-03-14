package typings
package semanticDashUiDashReactLib.distCommonjsAddonsMountNodeMountNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountNodeProps
  extends StrictMountNodeProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object MountNodeProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    node: stdLib.HTMLElement | reactLib.reactMod.ReactNs.Ref[_] = null
  ): MountNodeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountNodeProps]
  }
}

