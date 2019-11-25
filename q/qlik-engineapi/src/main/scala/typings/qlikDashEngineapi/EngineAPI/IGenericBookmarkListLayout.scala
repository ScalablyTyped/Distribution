package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkListLayout width extend GenericBaseLayout
  */
trait IGenericBookmarkListLayout extends IGenericBaseLayout {
  var qBookmarkList: IBookmarkList
}

object IGenericBookmarkListLayout {
  @scala.inline
  def apply(qBookmarkList: IBookmarkList, qInfo: INxInfo, qMeta: INxMeta): IGenericBookmarkListLayout = {
    val __obj = js.Dynamic.literal(qBookmarkList = qBookmarkList.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericBookmarkListLayout]
  }
}

