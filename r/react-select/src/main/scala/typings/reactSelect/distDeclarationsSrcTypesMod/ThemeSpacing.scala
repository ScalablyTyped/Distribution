package typings.reactSelect.distDeclarationsSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeSpacing extends StObject {
  
  var baseUnit: Double
  
  var controlHeight: Double
  
  var menuGutter: Double
}
object ThemeSpacing {
  
  inline def apply(baseUnit: Double, controlHeight: Double, menuGutter: Double): ThemeSpacing = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], menuGutter = menuGutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeSpacing]
  }
  
  extension [Self <: ThemeSpacing](x: Self) {
    
    inline def setBaseUnit(value: Double): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
    
    inline def setControlHeight(value: Double): Self = StObject.set(x, "controlHeight", value.asInstanceOf[js.Any])
    
    inline def setMenuGutter(value: Double): Self = StObject.set(x, "menuGutter", value.asInstanceOf[js.Any])
  }
}
