package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableHeight extends StObject {
  
  var disableHeight: `false` = js.native
  
  var disableWidth: `false` = js.native
  
  def onResize(): Unit = js.native
}
object DisableHeight {
  
  @scala.inline
  def apply(disableHeight: `false`, disableWidth: `false`, onResize: () => Unit): DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight.asInstanceOf[js.Any], disableWidth = disableWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize))
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
