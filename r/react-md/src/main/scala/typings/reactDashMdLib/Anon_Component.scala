package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component
  extends // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var label: reactLib.reactMod.ReactNs.ReactNode
}

object Anon_Component {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    icon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    iconChildren: reactLib.reactMod.ReactNs.ReactNode = null,
    iconClassName: java.lang.String = null
  ): Anon_Component = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconChildren != null) __obj.updateDynamic("iconChildren")(iconChildren.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    __obj.asInstanceOf[Anon_Component]
  }
}

