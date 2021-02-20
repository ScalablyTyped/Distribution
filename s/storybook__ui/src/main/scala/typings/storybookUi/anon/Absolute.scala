package typings.storybookUi.anon

import typings.std.Record
import typings.storybookUi.storybookUiStrings.bottom
import typings.storybookUi.storybookUiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolute extends StObject {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var actions: OnSelect with (Record[String, _]) = js.native
  
  var panelPosition: js.UndefOr[bottom | right] = js.native
  
  var panels: Record[String, _] = js.native
  
  var selectedPanel: js.UndefOr[String] = js.native
  
  var shortcuts: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['shortcuts'] */ js.Any = js.native
}
object Absolute {
  
  @scala.inline
  def apply(
    actions: OnSelect with (Record[String, _]),
    panels: Record[String, _],
    shortcuts: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['shortcuts'] */ js.Any
  ): Absolute = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit class AbsoluteMutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    @scala.inline
    def setActions(value: OnSelect with (Record[String, _])): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPosition(value: bottom | right): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPositionUndefined: Self = StObject.set(x, "panelPosition", js.undefined)
    
    @scala.inline
    def setPanels(value: Record[String, _]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
    
    @scala.inline
    def setShortcuts(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['shortcuts'] */ js.Any
    ): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
  }
}
