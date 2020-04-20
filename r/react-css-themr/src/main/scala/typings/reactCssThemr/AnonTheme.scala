package typings.reactCssThemr

import typings.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme extends js.Object {
  var theme: TReactCSSThemrTheme
}

object AnonTheme {
  @scala.inline
  def apply(theme: TReactCSSThemrTheme): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme]
  }
}

