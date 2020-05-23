package typings.reactCssThemr.anon

import typings.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var theme: TReactCSSThemrTheme
}

object Theme {
  @scala.inline
  def apply(theme: TReactCSSThemrTheme): Theme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

