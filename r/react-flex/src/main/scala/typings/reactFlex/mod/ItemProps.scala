package typings.reactFlex.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.reactFlex.reactFlexStrings.`fit-content`
import typings.reactFlex.reactFlexStrings.`max-content`
import typings.reactFlex.reactFlexStrings.`min-content`
import typings.reactFlex.reactFlexStrings.auto
import typings.reactFlex.reactFlexStrings.content
import typings.reactFlex.reactFlexStrings.fit
import typings.reactFlex.reactFlexStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps
  extends Props[Flex]
     with CommonFlexProps {
  /**
    * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
    * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
    */
  var flexBasis: js.UndefOr[
    Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit
  ] = js.undefined
  /**
    * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
    */
  var flexGrow: js.UndefOr[Double | String | Boolean] = js.undefined
  /**
    * A value for the `flex-shrink` css property. From `0` to `24`.
    */
  var flexShrink: js.UndefOr[Double | String] = js.undefined
}

object ItemProps {
  @scala.inline
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    children: ReactNode = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    flexBasis: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit = null,
    flexGrow: Double | String | Boolean = null,
    flexShrink: Double | String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    key: Key = null,
    ref: LegacyRef[Flex] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

