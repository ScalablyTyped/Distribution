package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  var typography: typings.storybookTheming.typesMod.Typography
}
object Typography {
  
  @scala.inline
  def apply(typography: typings.storybookTheming.typesMod.Typography): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypography(value: typings.storybookTheming.typesMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
