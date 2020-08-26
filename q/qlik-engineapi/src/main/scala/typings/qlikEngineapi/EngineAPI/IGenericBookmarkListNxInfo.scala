package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.BookmarkList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListNxInfo width extend NxInfo
  */
@js.native
trait IGenericBookmarkListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericBookmarkListNxInfo: BookmarkList = js.native
}

object IGenericBookmarkListNxInfo {
  @scala.inline
  def apply(qType: BookmarkList): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
  @scala.inline
  implicit class IGenericBookmarkListNxInfoOps[Self <: IGenericBookmarkListNxInfo] (val x: Self) extends AnyVal {
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
    def setQType(value: BookmarkList): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

