package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var layout: AnonIsFullscreen
  var selectedPanel: js.Any
  var theme: js.Any
  var ui: AnonDocsMode
}

object AnonLayout {
  @scala.inline
  def apply(layout: AnonIsFullscreen, selectedPanel: js.Any, theme: js.Any, ui: AnonDocsMode): AnonLayout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
}

