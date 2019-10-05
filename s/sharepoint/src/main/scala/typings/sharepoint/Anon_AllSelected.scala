package typings.sharepoint

import typings.sharepoint.SP.JsGrid.IStyleType.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSelected extends js.Object {
  var allSelected: Header
  var allSelectedHover: Header
  var normal: Header
  var normalHover: Header
  var partSelected: Header
  var partSelectedHover: Header
}

object Anon_AllSelected {
  @scala.inline
  def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): Anon_AllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected, allSelectedHover = allSelectedHover, normal = normal, normalHover = normalHover, partSelected = partSelected, partSelectedHover = partSelectedHover)
  
    __obj.asInstanceOf[Anon_AllSelected]
  }
}

