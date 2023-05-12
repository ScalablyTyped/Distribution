package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var background: typings.storybookTheming.distCreateC2b2ce6dMod.Background
  
  var color: typings.storybookTheming.distCreateC2b2ce6dMod.Color
  
  var typography: typings.storybookTheming.distCreateC2b2ce6dMod.Typography
}
object Color {
  
  inline def apply(
    background: typings.storybookTheming.distCreateC2b2ce6dMod.Background,
    color: typings.storybookTheming.distCreateC2b2ce6dMod.Color,
    typography: typings.storybookTheming.distCreateC2b2ce6dMod.Typography
  ): Color = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: typings.storybookTheming.distCreateC2b2ce6dMod.Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.storybookTheming.distCreateC2b2ce6dMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: typings.storybookTheming.distCreateC2b2ce6dMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
