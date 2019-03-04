package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupTableInfo extends js.Object {
  var id: java.lang.String
  var limitToList: js.UndefOr[scala.Boolean] = js.undefined
  var lookup: js.Array[ILookupInfo]
  var showImage: js.UndefOr[scala.Boolean] = js.undefined
  var showText: js.UndefOr[scala.Boolean] = js.undefined
}

object ILookupTableInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    lookup: js.Array[ILookupInfo],
    limitToList: js.UndefOr[scala.Boolean] = js.undefined,
    showImage: js.UndefOr[scala.Boolean] = js.undefined,
    showText: js.UndefOr[scala.Boolean] = js.undefined
  ): ILookupTableInfo = {
    val __obj = js.Dynamic.literal(id = id, lookup = lookup)
    if (!js.isUndefined(limitToList)) __obj.updateDynamic("limitToList")(limitToList)
    if (!js.isUndefined(showImage)) __obj.updateDynamic("showImage")(showImage)
    if (!js.isUndefined(showText)) __obj.updateDynamic("showText")(showText)
    __obj.asInstanceOf[ILookupTableInfo]
  }
}

