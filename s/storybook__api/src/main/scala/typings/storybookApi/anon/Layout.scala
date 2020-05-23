package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var layout: IsFullscreen
  var selectedPanel: js.Any
  var theme: js.Any
  var ui: DocsMode
}

object Layout {
  @scala.inline
  def apply(layout: IsFullscreen, selectedPanel: js.Any, theme: js.Any, ui: DocsMode): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}

