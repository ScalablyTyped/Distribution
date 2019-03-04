package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal(qBookmarkList = qBookmarkList, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericBookmarkListLayout]
  }
}

