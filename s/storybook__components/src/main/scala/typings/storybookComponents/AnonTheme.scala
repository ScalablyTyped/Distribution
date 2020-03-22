package typings.storybookComponents

import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTheme extends js.Object {
  var theme: Theme = js.native
}

object AnonTheme {
  @scala.inline
  def apply(theme: Theme): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTheme]
  }
}

