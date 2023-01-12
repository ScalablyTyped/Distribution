package typings.storybookTheming.anon

import typings.storybookTheming.mod.Typography_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  var typography: Typography_
}
object Typography {
  
  inline def apply(typography: Typography_): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    inline def setTypography(value: Typography_): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
  }
}
