package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTheme extends StObject {
  
  var theme: typings.storybookTheming.mod.Theme
}
object ThemeTheme {
  
  inline def apply(theme: typings.storybookTheming.mod.Theme): ThemeTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeTheme] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: typings.storybookTheming.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
