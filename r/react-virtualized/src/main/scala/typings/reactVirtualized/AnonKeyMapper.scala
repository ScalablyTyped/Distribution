package typings.reactVirtualized

import typings.reactVirtualized.esMasonryMod.emptyObject
import typings.reactVirtualized.esMasonryMod.identity
import typings.reactVirtualized.esMasonryMod.noop
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`150`
import typings.reactVirtualized.reactVirtualizedNumbers.`20`
import typings.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyMapper extends js.Object {
  var autoHeight: `false`
  var keyMapper: identity
  var onCellsRendered: noop
  var onScroll: noop
  var overscanByPixels: `20`
  var role: grid
  var scrollingResetTimeInterval: `150`
  var style: emptyObject
  var tabIndex: `0`
}

object AnonKeyMapper {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => js.Any,
    onCellsRendered: () => Unit,
    onScroll: () => Unit,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: `150`,
    style: emptyObject,
    tabIndex: `0`
  ): AnonKeyMapper = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], keyMapper = js.Any.fromFunction1(keyMapper), onCellsRendered = js.Any.fromFunction0(onCellsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanByPixels = overscanByPixels.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyMapper]
  }
}

