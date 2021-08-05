package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: ReactNode
  
  var elementNum: Double
  
  var transitionEffect: From
}
object Children {
  
  inline def apply(elementNum: Double, transitionEffect: From): Children = {
    val __obj = js.Dynamic.literal(elementNum = elementNum.asInstanceOf[js.Any], transitionEffect = transitionEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setElementNum(value: Double): Self = StObject.set(x, "elementNum", value.asInstanceOf[js.Any])
    
    inline def setTransitionEffect(value: From): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
  }
}
