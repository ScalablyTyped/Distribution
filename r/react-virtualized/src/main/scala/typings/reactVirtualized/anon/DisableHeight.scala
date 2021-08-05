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
  
  inline def apply(onResize: () => Unit): DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = false, disableWidth = false, onResize = js.Any.fromFunction0(onResize))
    __obj.asInstanceOf[DisableHeight]
  }
  
  extension [Self <: DisableHeight](x: Self) {
    
    inline def setDisableHeight(value: `false`): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
    
    inline def setDisableWidth(value: `false`): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
  }
}
