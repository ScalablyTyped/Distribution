package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var theme: typings.storybookTheming.mod.Theme
}
object Theme {
  
  inline def apply(theme: typings.storybookTheming.mod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: typings.storybookTheming.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
