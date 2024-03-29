package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: Background
  
  var dark: Boolean
}
object Colors {
  
  inline def apply(colors: Background, dark: Boolean): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
  }
}
