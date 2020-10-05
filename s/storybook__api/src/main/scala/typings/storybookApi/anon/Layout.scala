package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout extends js.Object {
  var layout: IsFullscreen = js.native
  var selectedPanel: js.Any = js.native
  var theme: js.Any = js.native
  var ui: DocsMode = js.native
}

object Layout {
  @scala.inline
  def apply(layout: IsFullscreen, selectedPanel: js.Any, theme: js.Any, ui: DocsMode): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setLayout(value: IsFullscreen): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedPanel(value: js.Any): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setUi(value: DocsMode): Self = this.set("ui", value.asInstanceOf[js.Any])
  }
  
}

