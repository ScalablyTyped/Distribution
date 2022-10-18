package typings.storybookTheming.anon

import typings.storybookTheming.mod.Background_
import typings.storybookTheming.mod.Color_
import typings.storybookTheming.mod.Typography_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var background: Background_
  
  var color: Color_
  
  var typography: Typography_
}
object Color {
  
  inline def apply(background: Background_, color: Color_, typography: Typography_): Color = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setBackground(value: Background_): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: Typography_): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
