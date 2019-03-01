package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSelected extends js.Object {
  var allSelected: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  var allSelectedHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  var normal: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  var normalHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  var partSelected: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  var partSelectedHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
}

object Anon_AllSelected {
  @scala.inline
  def apply(
    allSelected: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header,
    allSelectedHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header,
    normal: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header,
    normalHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header,
    partSelected: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header,
    partSelectedHover: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header
  ): Anon_AllSelected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allSelected")(allSelected)
    __obj.updateDynamic("allSelectedHover")(allSelectedHover)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("normalHover")(normalHover)
    __obj.updateDynamic("partSelected")(partSelected)
    __obj.updateDynamic("partSelectedHover")(partSelectedHover)
    __obj.asInstanceOf[Anon_AllSelected]
  }
}

