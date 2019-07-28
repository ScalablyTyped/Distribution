package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Group can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.undefined
  /**
    * Whether the Group is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether there is a margin inside the group.
    */
  var margined: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the group.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object GroupProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    children: Element = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    label: String = null,
    margined: js.UndefOr[Boolean] = js.undefined,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(margined)) __obj.updateDynamic("margined")(margined)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GroupProps]
  }
}

