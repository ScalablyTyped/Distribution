package typings.storybookComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var theme: typings.storybookTheming.typesMod.Theme = js.native
}

object Theme {
  @scala.inline
  def apply(theme: typings.storybookTheming.typesMod.Theme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

