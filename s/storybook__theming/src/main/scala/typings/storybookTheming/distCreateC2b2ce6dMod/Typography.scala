package typings.storybookTheming.distCreateC2b2ce6dMod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Bold
import typings.storybookTheming.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  var fonts: Base
  
  var size: Code
  
  var weight: Bold
}
object Typography {
  
  inline def apply(fonts: Base, size: Code, weight: Bold): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
    
    inline def setFonts(value: Base): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Code): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Bold): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
