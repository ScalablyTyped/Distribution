package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnResize extends StObject {
  
  def onResize(): Unit = js.native
  
  def onScroll(): Unit = js.native
  
  var scrollElement: js.UndefOr[Window] = js.native
  
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  
  var serverHeight: `0` = js.native
  
  var serverWidth: `0` = js.native
}
object OnResize {
  
  @scala.inline
  def apply(
    onResize: () => Unit,
    onScroll: () => Unit,
    scrollingResetTimeInterval: /* 150 */ Double,
    serverHeight: `0`,
    serverWidth: `0`
  ): OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = serverHeight.asInstanceOf[js.Any], serverWidth = serverWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResize]
  }
  
  @scala.inline
  implicit class OnResizeMutableBuilder[Self <: OnResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollElement(value: Window): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
    
    @scala.inline
    def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerHeight(value: `0`): Self = StObject.set(x, "serverHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerWidth(value: `0`): Self = StObject.set(x, "serverWidth", value.asInstanceOf[js.Any])
  }
}
