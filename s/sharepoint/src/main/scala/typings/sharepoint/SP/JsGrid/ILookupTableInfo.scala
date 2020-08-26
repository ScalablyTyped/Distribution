package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ILookupTableInfo extends js.Object {
  var id: String = js.native
  var limitToList: js.UndefOr[Boolean] = js.native
  var lookup: js.Array[ILookupInfo] = js.native
  var showImage: js.UndefOr[Boolean] = js.native
  var showText: js.UndefOr[Boolean] = js.native
}

object ILookupTableInfo {
  @scala.inline
  def apply(id: String, lookup: js.Array[ILookupInfo]): ILookupTableInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookupTableInfo]
  }
  @scala.inline
  implicit class ILookupTableInfoOps[Self <: ILookupTableInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookupVarargs(value: ILookupInfo*): Self = this.set("lookup", js.Array(value :_*))
    @scala.inline
    def setLookup(value: js.Array[ILookupInfo]): Self = this.set("lookup", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimitToList(value: Boolean): Self = this.set("limitToList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitToList: Self = this.set("limitToList", js.undefined)
    @scala.inline
    def setShowImage(value: Boolean): Self = this.set("showImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowImage: Self = this.set("showImage", js.undefined)
    @scala.inline
    def setShowText(value: Boolean): Self = this.set("showText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
  }
  
}

