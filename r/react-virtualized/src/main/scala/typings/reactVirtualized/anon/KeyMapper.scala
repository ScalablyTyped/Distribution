package typings.reactVirtualized.anon

import typings.reactVirtualized.esMasonryMod.emptyObject
import typings.reactVirtualized.esMasonryMod.identity
import typings.reactVirtualized.esMasonryMod.noop
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`20`
import typings.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapper extends js.Object {
  var autoHeight: `false` = js.native
  var keyMapper: identity = js.native
  var onCellsRendered: noop = js.native
  var onScroll: noop = js.native
  var overscanByPixels: `20` = js.native
  var role: grid = js.native
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  var style: emptyObject = js.native
  var tabIndex: `0` = js.native
}

object KeyMapper {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => js.Any,
    onCellsRendered: () => Unit,
    onScroll: () => Unit,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: /* 150 */ Double,
    style: emptyObject,
    tabIndex: `0`
  ): KeyMapper = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], keyMapper = js.Any.fromFunction1(keyMapper), onCellsRendered = js.Any.fromFunction0(onCellsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanByPixels = overscanByPixels.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapper]
  }
  @scala.inline
  implicit class KeyMapperOps[Self <: KeyMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoHeight(value: `false`): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyMapper(value: /* value */ js.Any => js.Any): Self = this.set("keyMapper", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCellsRendered(value: () => Unit): Self = this.set("onCellsRendered", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setOverscanByPixels(value: `20`): Self = this.set("overscanByPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: grid): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: emptyObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: `0`): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
  
}

