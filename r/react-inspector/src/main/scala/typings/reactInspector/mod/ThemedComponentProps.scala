package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemedComponentProps extends js.Object {
  var theme: js.UndefOr[InspectorTheme] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(theme: InspectorTheme = null): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

