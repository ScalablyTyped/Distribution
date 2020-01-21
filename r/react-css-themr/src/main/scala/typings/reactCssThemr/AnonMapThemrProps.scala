package typings.reactCssThemr

import typings.reactCssThemr.mod.TMapThemrProps
import typings.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMapThemrProps[P] extends js.Object {
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.undefined
}

object AnonMapThemrProps {
  @scala.inline
  def apply[P](mapThemrProps: (P, /* theme */ TReactCSSThemrTheme) => P with AnonTheme = null): AnonMapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(js.Any.fromFunction2(mapThemrProps))
    __obj.asInstanceOf[AnonMapThemrProps[P]]
  }
}

