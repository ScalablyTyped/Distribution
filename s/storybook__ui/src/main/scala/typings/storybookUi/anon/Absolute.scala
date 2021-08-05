package typings.storybookUi.anon

import typings.std.Record
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookUi.storybookUiStrings.bottom
import typings.storybookUi.storybookUiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  var absolute: js.UndefOr[Boolean] = js.undefined
  
  var actions: OnSelect & (Record[String, js.Any])
  
  var panelPosition: js.UndefOr[bottom | right] = js.undefined
  
  var panels: Record[String, js.Any]
  
  var selectedPanel: js.UndefOr[String] = js.undefined
  
  var shortcuts: Shortcuts
}
object Absolute {
  
  inline def apply(actions: OnSelect & (Record[String, js.Any]), panels: Record[String, js.Any], shortcuts: Shortcuts): Absolute = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  extension [Self <: Absolute](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setActions(value: OnSelect & (Record[String, js.Any])): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setPanelPosition(value: bottom | right): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
    
    inline def setPanelPositionUndefined: Self = StObject.set(x, "panelPosition", js.undefined)
    
    inline def setPanels(value: Record[String, js.Any]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    inline def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
    
    inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
  }
}
