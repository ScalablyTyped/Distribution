package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps extends js.Object {
  var children: js.UndefOr[Children] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object PaneProps {
  @scala.inline
  def apply(
    children: Children = null,
    className: java.lang.String = null,
    leaflet: LeafletContext = null,
    name: java.lang.String = null,
    pane: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): PaneProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaneProps]
  }
}

