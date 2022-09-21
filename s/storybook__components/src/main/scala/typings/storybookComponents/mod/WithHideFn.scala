package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithHideFn extends StObject {
  
  def onHide(): Unit
}
object WithHideFn {
  
  inline def apply(onHide: () => Unit): WithHideFn = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[WithHideFn]
  }
  
  extension [Self <: WithHideFn](x: Self) {
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
  }
}
