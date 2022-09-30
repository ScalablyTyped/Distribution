package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedInts.`0`
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnResize extends StObject {
  
  def onResize(): Unit
  
  def onScroll(): Unit
  
  var scrollElement: js.UndefOr[Window] = js.undefined
  
  var scrollingResetTimeInterval: /* 150 */ Double
  
  var serverHeight: `0`
  
  var serverWidth: `0`
}
object OnResize {
  
  inline def apply(onResize: () => Unit, onScroll: () => Unit, scrollingResetTimeInterval: /* 150 */ Double): OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = 0, serverWidth = 0)
    __obj.asInstanceOf[OnResize]
  }
  
  extension [Self <: OnResize](x: Self) {
    
    inline def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
    
    inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    inline def setScrollElement(value: Window): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
    
    inline def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
    
    inline def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    inline def setServerHeight(value: `0`): Self = StObject.set(x, "serverHeight", value.asInstanceOf[js.Any])
    
    inline def setServerWidth(value: `0`): Self = StObject.set(x, "serverWidth", value.asInstanceOf[js.Any])
  }
}
