package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableHeight extends StObject {
  
  var disableHeight: `false`
  
  var disableWidth: `false`
  
  def onResize(): Unit
}
object DisableHeight {
  
  @scala.inline
  def apply(onResize: () => Unit): DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = false, disableWidth = false, onResize = js.Any.fromFunction0(onResize))
    __obj.asInstanceOf[DisableHeight]
  }
  
  @scala.inline
  implicit class DisableHeightMutableBuilder[Self <: DisableHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableHeight(value: `false`): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableWidth(value: `false`): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
  }
}
