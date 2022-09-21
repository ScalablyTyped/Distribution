package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneWatchPaneType extends StObject {
  
  var deep: Boolean
  
  def handler(): Unit
  
  var immediate: Boolean
}
object SplitpaneWatchPaneType {
  
  inline def apply(deep: Boolean, handler: () => Unit, immediate: Boolean): SplitpaneWatchPaneType = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], handler = js.Any.fromFunction0(handler), immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneWatchPaneType]
  }
  
  extension [Self <: SplitpaneWatchPaneType](x: Self) {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
  }
}
