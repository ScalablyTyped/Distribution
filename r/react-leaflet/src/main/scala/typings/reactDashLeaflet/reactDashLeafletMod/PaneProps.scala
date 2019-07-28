package typings.reactDashLeaflet.reactDashLeafletMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps extends js.Object {
  var children: js.UndefOr[Children] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PaneProps {
  @scala.inline
  def apply(
    children: Children = null,
    className: String = null,
    leaflet: LeafletContext = null,
    name: String = null,
    pane: String = null,
    style: CSSProperties = null
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

