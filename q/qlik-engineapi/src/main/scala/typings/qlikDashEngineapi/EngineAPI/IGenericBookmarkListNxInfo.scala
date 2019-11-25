package typings.qlikDashEngineapi.EngineAPI

import typings.qlikDashEngineapi.qlikDashEngineapiStrings.BookmarkList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListNxInfo width extend NxInfo
  */
trait IGenericBookmarkListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericBookmarkListNxInfo: BookmarkList
}

object IGenericBookmarkListNxInfo {
  @scala.inline
  def apply(qType: BookmarkList, qId: String = null): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    if (qId != null) __obj.updateDynamic("qId")(qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
}

