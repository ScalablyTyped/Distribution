package typings
package reactDashFlexLib.reactDashFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps
  extends reactLib.reactMod.ReactNs.Props[Flex]
     with CommonFlexProps

object FlexProps {
  @scala.inline
  def apply(
    alignContent: java.lang.String = null,
    alignItems: java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    column: js.UndefOr[scala.Boolean] = js.undefined,
    display: java.lang.String = null,
    flex: scala.Double | java.lang.String | scala.Boolean = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    justifyContent: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[Flex] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    row: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column)
    if (display != null) __obj.updateDynamic("display")(display)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[FlexProps]
  }
}

