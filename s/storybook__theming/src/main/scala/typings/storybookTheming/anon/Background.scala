package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: typings.storybookTheming.typesMod.Background
  
  var color: typings.storybookTheming.typesMod.Color
  
  var typography: typings.storybookTheming.typesMod.Typography
}
object Background {
  
  @scala.inline
  def apply(
    background: typings.storybookTheming.typesMod.Background,
    color: typings.storybookTheming.typesMod.Color,
    typography: typings.storybookTheming.typesMod.Typography
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: typings.storybookTheming.typesMod.Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: typings.storybookTheming.typesMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypography(value: typings.storybookTheming.typesMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
