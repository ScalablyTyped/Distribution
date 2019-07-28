package typings.reactDashCssDashThemr

import typings.reactDashCssDashThemr.reactDashCssDashThemrMod.TMapThemrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapThemrProps[P] extends js.Object {
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.undefined
}

object Anon_MapThemrProps {
  @scala.inline
  def apply[P](mapThemrProps: TMapThemrProps[P] = null): Anon_MapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(mapThemrProps)
    __obj.asInstanceOf[Anon_MapThemrProps[P]]
  }
}

