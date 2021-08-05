package typings.reactNative.anon

import typings.reactNative.mod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait False extends StObject {
  
  var `false`: ColorValue
  
  var `true`: ColorValue
}
object False {
  
  inline def apply(`false`: ColorValue, `true`: ColorValue): False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
  
  extension [Self <: False](x: Self) {
    
    inline def setFalse(value: ColorValue): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    inline def setTrue(value: ColorValue): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
  }
}
