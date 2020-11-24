package typings.storybookUi.anon

import typings.std.Record
import typings.storybookUi.storybookUiStrings.bottom
import typings.storybookUi.storybookUiStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolute extends js.Object {
  
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
  implicit class AbsoluteOps[Self <: Absolute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActions(value: OnSelect with (Record[String, _])): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanels(value: Record[String, _]): Self = this.set("panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcuts(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['shortcuts'] */ js.Any
    ): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setPanelPosition(value: bottom | right): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelPosition: Self = this.set("panelPosition", js.undefined)
    
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedPanel: Self = this.set("selectedPanel", js.undefined)
  }
}
