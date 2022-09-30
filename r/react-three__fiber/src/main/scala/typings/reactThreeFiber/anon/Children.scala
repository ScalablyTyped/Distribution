package typings.reactThreeFiber.anon

import typings.react.mod.Dispatch
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: ReactNode
  
  var set: Dispatch[js.UndefOr[js.Error]]
}
object Children {
  
  inline def apply(set: js.UndefOr[js.Error] => Unit): Children = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSet(value: js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
