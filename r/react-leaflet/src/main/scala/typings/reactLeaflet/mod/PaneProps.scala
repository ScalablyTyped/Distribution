package typings.reactLeaflet.mod

import typings.react.mod.CSSProperties
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
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneProps]
  }
}

