package typings.sharepoint

import typings.sharepoint.SP.JsGrid.IStyleType.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllSelected extends js.Object {
  var allSelected: Header
  var allSelectedHover: Header
  var normal: Header
  var normalHover: Header
  var partSelected: Header
  var partSelectedHover: Header
}

object AnonAllSelected {
  @scala.inline
  def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): AnonAllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], allSelectedHover = allSelectedHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any], partSelected = partSelected.asInstanceOf[js.Any], partSelectedHover = partSelectedHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllSelected]
  }
}

