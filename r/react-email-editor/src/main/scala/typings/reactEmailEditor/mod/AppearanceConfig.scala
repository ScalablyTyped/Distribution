package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Tools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppearanceConfig extends StObject {
  
  val panels: js.UndefOr[Tools] = js.undefined
  
  val theme: js.UndefOr[ThemeColor] = js.undefined
}
object AppearanceConfig {
  
  inline def apply(): AppearanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearanceConfig]
  }
  
  extension [Self <: AppearanceConfig](x: Self) {
    
    inline def setPanels(value: Tools): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    inline def setTheme(value: ThemeColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
