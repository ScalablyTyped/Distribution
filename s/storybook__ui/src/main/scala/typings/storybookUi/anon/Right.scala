package typings.storybookUi.anon

import typings.storybookAddons.distMod.Addon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var left: js.Array[Addon]
  
  var right: js.Array[Addon]
}
object Right {
  
  inline def apply(left: js.Array[Addon], right: js.Array[Addon]): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setLeft(value: js.Array[Addon]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftVarargs(value: Addon*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    inline def setRight(value: js.Array[Addon]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightVarargs(value: Addon*): Self = StObject.set(x, "right", js.Array(value :_*))
  }
}
