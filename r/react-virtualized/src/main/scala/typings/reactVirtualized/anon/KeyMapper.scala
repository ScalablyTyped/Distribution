package typings.reactVirtualized.anon

import typings.reactVirtualized.esMasonryMod.emptyObject
import typings.reactVirtualized.esMasonryMod.identity
import typings.reactVirtualized.esMasonryMod.noop
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`20`
import typings.reactVirtualized.reactVirtualizedStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapper extends StObject {
  
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
  implicit class KeyMapperMutableBuilder[Self <: KeyMapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHeight(value: `false`): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMapper(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "keyMapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCellsRendered(value: () => Unit): Self = StObject.set(x, "onCellsRendered", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverscanByPixels(value: `20`): Self = StObject.set(x, "overscanByPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: grid): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: emptyObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
