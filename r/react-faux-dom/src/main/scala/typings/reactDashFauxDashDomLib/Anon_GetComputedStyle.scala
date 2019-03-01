package typings
package reactDashFauxDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetComputedStyle extends js.Object {
  def getComputedStyle(node: reactDashFauxDashDomLib.reactDashFauxDashDomMod.Element): Anon_GetPropertyValue
}

object Anon_GetComputedStyle {
  @scala.inline
  def apply(
    getComputedStyle: js.Function1[reactDashFauxDashDomLib.reactDashFauxDashDomMod.Element, Anon_GetPropertyValue]
  ): Anon_GetComputedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getComputedStyle")(getComputedStyle)
    __obj.asInstanceOf[Anon_GetComputedStyle]
  }
}

