package typings.reactCssThemr.anon

import typings.reactCssThemr.mod.TMapThemrProps
import typings.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapThemrProps[P] extends js.Object {
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.undefined
}

object MapThemrProps {
  @scala.inline
  def apply[P](mapThemrProps: (P, /* theme */ TReactCSSThemrTheme) => P with Theme = null): MapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(js.Any.fromFunction2(mapThemrProps))
    __obj.asInstanceOf[MapThemrProps[P]]
  }
}

