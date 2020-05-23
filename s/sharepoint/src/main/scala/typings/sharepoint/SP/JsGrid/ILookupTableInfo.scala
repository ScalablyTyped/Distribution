package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupTableInfo extends js.Object {
  var id: String
  var limitToList: js.UndefOr[Boolean] = js.undefined
  var lookup: js.Array[ILookupInfo]
  var showImage: js.UndefOr[Boolean] = js.undefined
  var showText: js.UndefOr[Boolean] = js.undefined
}

object ILookupTableInfo {
  @scala.inline
  def apply(
    id: String,
    lookup: js.Array[ILookupInfo],
    limitToList: js.UndefOr[Boolean] = js.undefined,
    showImage: js.UndefOr[Boolean] = js.undefined,
    showText: js.UndefOr[Boolean] = js.undefined
  ): ILookupTableInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    if (!js.isUndefined(limitToList)) __obj.updateDynamic("limitToList")(limitToList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showImage)) __obj.updateDynamic("showImage")(showImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showText)) __obj.updateDynamic("showText")(showText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookupTableInfo]
  }
}

