package typings.reactEmailEditor.mod

import typings.reactEmailEditor.anon.Tools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppearanceConfig extends StObject {
  
  val panels: js.UndefOr[Tools] = js.native
  
  val theme: js.UndefOr[ThemeColor] = js.native
}
object AppearanceConfig {
  
  @scala.inline
  def apply(): AppearanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppearanceConfig]
  }
  
  @scala.inline
  implicit class AppearanceConfigMutableBuilder[Self <: AppearanceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPanels(value: Tools): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
