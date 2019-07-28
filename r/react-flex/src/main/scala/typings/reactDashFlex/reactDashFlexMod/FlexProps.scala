package typings.reactDashFlex.reactDashFlexMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps
  extends Props[Flex]
     with CommonFlexProps

object FlexProps {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    children: ReactNode = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    key: Key = null,
    ref: LegacyRef[Flex] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined
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

