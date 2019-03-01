package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListNxInfo width extend NxInfo
  */
trait IGenericBookmarkListNxInfo extends INxInfo {
  @JSName("qType")
  var qType_IGenericBookmarkListNxInfo: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.BookmarkList
}

object IGenericBookmarkListNxInfo {
  @scala.inline
  def apply(qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.BookmarkList, qId: java.lang.String = null): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qType")(qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
}

