package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  var typography: typings.storybookTheming.distCreateC2b2ce6dMod.Typography
}
object Typography {
  
  inline def apply(typography: typings.storybookTheming.distCreateC2b2ce6dMod.Typography): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    inline def setTypography(value: typings.storybookTheming.distCreateC2b2ce6dMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
