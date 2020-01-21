package typings.reactEmailEditor.mod

import typings.reactEmailEditor.AnonTools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearanceConfig extends js.Object {
  val panels: js.UndefOr[AnonTools] = js.undefined
  val theme: js.UndefOr[ThemeColor] = js.undefined
}

object AppearanceConfig {
  @scala.inline
  def apply(panels: AnonTools = null, theme: ThemeColor = null): AppearanceConfig = {
    val __obj = js.Dynamic.literal()
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearanceConfig]
  }
}

