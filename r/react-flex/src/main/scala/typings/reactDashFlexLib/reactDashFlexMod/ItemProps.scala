package typings
package reactDashFlexLib.reactDashFlexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps
  extends reactLib.reactMod.Props[Flex]
     with CommonFlexProps {
  /**
    * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
    * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
    */
  var flexBasis: js.UndefOr[
    scala.Double | reactDashFlexLib.reactDashFlexLibStrings.none | reactDashFlexLib.reactDashFlexLibStrings.auto | reactDashFlexLib.reactDashFlexLibStrings.content | reactDashFlexLib.reactDashFlexLibStrings.`fit-content` | reactDashFlexLib.reactDashFlexLibStrings.`min-content` | reactDashFlexLib.reactDashFlexLibStrings.`max-content` | reactDashFlexLib.reactDashFlexLibStrings.fit
  ] = js.undefined
  /**
    * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
    */
  var flexGrow: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
  /**
    * A value for the `flex-shrink` css property. From `0` to `24`.
    */
  var flexShrink: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ItemProps {
  @scala.inline
  def apply(
    alignContent: java.lang.String = null,
    alignItems: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    column: js.UndefOr[scala.Boolean] = js.undefined,
    display: java.lang.String = null,
    flex: scala.Double | java.lang.String | scala.Boolean = null,
    flexBasis: scala.Double | reactDashFlexLib.reactDashFlexLibStrings.none | reactDashFlexLib.reactDashFlexLibStrings.auto | reactDashFlexLib.reactDashFlexLibStrings.content | reactDashFlexLib.reactDashFlexLibStrings.`fit-content` | reactDashFlexLib.reactDashFlexLibStrings.`min-content` | reactDashFlexLib.reactDashFlexLibStrings.`max-content` | reactDashFlexLib.reactDashFlexLibStrings.fit = null,
    flexGrow: scala.Double | java.lang.String | scala.Boolean = null,
    flexShrink: scala.Double | java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    justifyContent: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[Flex] = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    row: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column)
    if (display != null) __obj.updateDynamic("display")(display)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ItemProps]
  }
}

